/**
*   @Objetivo            : Funciones JavaScript para los jsp
*   @Author				 : RZS
*   @Versi���n         : 1.0.0
*/ 

var verificaSession=1;
var inicializar = true;

function abrePopup(liga,objproc,nombreventana,anchoventana,largoventana,_resize,_scrollbar){

var parametros = '';
var ancho_pantalla = 0;
var alto_pantalla = 0;
var posx = 0;
var posy = 0;
	
		ancho_pantalla = screen.availWidth;
		alto_pantalla = screen.availHeight;
		
		posx = (ancho_pantalla - anchoventana)/2;
		posy = (alto_pantalla - largoventana)/2;
		
		
		
		parametros = 'dependent=true,toolbar=no,menubar=no,status=no,directories=no,location=no,width='+anchoventana+',height='+largoventana;
		if(_resize == 1)
			parametros = parametros + ',resizable=1'
		if(_scrollbar == 1)
			parametros = parametros + ',scrollbars=1';
			
			parametros  = "'"+parametros+"'"

			

		ventana = window.open(liga,nombreventana,parametros);
		
		ventana.focus();
		ventana.moveTo(posx,posy)
		children.push(ventana);
}

function relocation(){
	if(self==top)
	{
	 document.documentElement.style.display='block'; 
	 document.documentElement.style.visibility='visible';
	}
	else
	{
		 top.location = self.location;
	}

}


function AccionCaracter(val1, val2, nombreformulario)
{
    var ilen = document.forms[nombreformulario].length;
    for(var x=0; x < ilen; x++) {
        if (document.forms[nombreformulario].elements[x].name == val1) {
            document.forms[nombreformulario].elements[x].parentNode.removeChild(document.forms[nombreformulario].elements[x]);
            x = x - 1;
            ilen = document.forms[nombreformulario].length;
        }
    }
    var objHTML = document.createElement("INPUT");
    objHTML.setAttribute("type", "hidden");
    objHTML.setAttribute("name", val1);
    objHTML.setAttribute("value", val2);
    document.forms[nombreformulario].appendChild(objHTML);
}
function agregaCampo(nombre,valor,forma)
{
	for(i = 0 ; i < nombre.length; i++)
		AccionCaracter(nombre[i],valor[i],forma);
	submitForma(forma);
}

function submitForma(forma)
{	
	document.forms[forma].submit();
}

function limpiaLogin(){
	document.getElementById('usuario').value='';
	document.getElementById('password').value='';
}

function cargaIndice(){
	xmlHttpReq = getHttpRequest();
	xmlHttpReq.open("POST", "/nok/indice/getIndice.action", true);
	xmlHttpReq.setRequestHeader("Content-Type", "application/x-www-form-urlencoded");
	xmlHttpReq.send('');
	
	divindice = document.getElementById('indicediv');
	
	
	xmlHttpReq.onreadystatechange = function() 
	{
		if (xmlHttpReq.readyState == 4) 
		{
			if (xmlHttpReq.status == 200) 
			{
				respuesta = xmlHttpReq.responseText;
				if(respuesta != 'error')
				divindice.innerHTML = respuesta;
			}
		}
	}	
}

function validalogin(evento)
{
	aux = 0;

	var charCode = (evento.which) ? evento.which : evento.keyCode
	
	if(charCode == 13)
	{
		validalogin2()
	}
	
}

function validalogin2(){
	if(document.forms['loginform'].usuario.value != "" && document.forms['loginform'].password.value != "")
	{
		if(validaCaracterEspecial(document.forms['loginform'].usuario.value) && validaCaracterEspecial(document.forms['loginform'].password.value)){
			agregaCampo(['lg','Aceptar'],['cgam','Aceptar'],'loginform');
			return true;
		}else{
			alert("No se permiten caracteres especiales. Verifique.");
		}
	}
	else if(document.forms['loginform'].usuario.value == "" || document.forms['loginform'].password.value == ""){
		alert("Por favor, introduzca su usuario y password.");
	}
}

function validaCaracterEspecial(cadena)
{

	var iChars = "!@#$%^&*()+=-[]\';,./{}|\":<>?";
	for (var i = 0; i < cadena.length; i++) {
	  	if (iChars.indexOf(cadena.charAt(i)) != -1) 
		{
			return false;
		}
	}
	return true
}

function pintagrafica(urlgrafica){
      var chart = new FusionCharts("/Charts/MSArea.swf", "ChartId", "100%", "200", "0", "0","FFFFFF");
      chart.setDataURL(urlgrafica);		   
      chart.render("indicediv");

}

function seleccionaIndice(idobj){
	var idindices = new Array(4);
	
	idindices[0] = 'ipc';
	idindices[1] = 'dowjones';
	idindices[2] = 'nasdaq';
	idindices[3] = 'resumen';
	for(i=0 ; i< idindices.length; i++){
		if(idobj == idindices[i]){
			document.getElementById(idindices[i]).style.background='#99CCFF';
		}
		else{
			document.getElementById(idindices[i]).style.background='#F4F8FF';
		}
		
	}

}

function abrelinkexterno(link){
	if(confirm('Usted est��� dejando un sitio administrado por Acciones y Valores Banamex, S.A. de C.V, Casa de Bolsa, Integrante del Grupo Financiero Banamex (Accival). El acceso a la liga se���alada no significa que dicha informaci���n sea completa o suficiente para llevar a cabo decisiones en materia de inversi���n, la intenci���n de proporcionar esta informaci���n no implica la emisi���n de juicios de valor, ni sugerencias de inversi���n por parte de ning���n integrante del Grupo Financiero Banamex. Accival incluye en su sitio ligas a otras p���ginas Web que pudieran ser de su inter���s, pero cuyo material ha sido desarrollado y es mantenido por entidades independientes y sin ning���n tipo de asociaci���n con los integrantes de Grupo Financiero Banamex, por lo que Accival no se hace responsable de la actualizaci���n, calidad, veracidad, integridad y consistencia de la informaci���n que en dichos sitios se presente. Ning���n integrante, ni la controladora de Grupo Financiero Banamex ofrece garant���a respecto de informaci���n generada por terceros.'))
	{
		abrePopup(link,'','',885,710,1,1);
	}
}
// Lleva el numero de ventanas abiertas del menu.
var children = [];
var contador = 0;
var timerId = null;
var fObj = null;
var tiempoCierreVentanas=960000;

// Temporizador para checar la sesion, llegando a los 18 minutos
function doTimer(valor) 
{/*
	 var url ='/nok/login/checkSessionIdle.action';
       url+='?verificaSesion='+verificaSession;
	var usuario = document.getElementById('user').value;
	jQuery.ajax(
	{
		type : "POST",
		url : url,
		success : function(params) 
		{
			datos=params.split('\n');
					
			if (timerId != null) 
			{
				var timeTmp = (new Date()).getTime() - fObj.getTime();
				// si es menor a 15 min o la llamada viene del timer
				if  (timeTmp < 900000 || valor != undefined) 
				{ 
					clearTimeout(timerId);
					// alert('Tiempo : ' + timeTmp + ' --- Valor : ' + valor);
				}
			}
			if(datos.length>2 && !inicializar){
				tiempoCierreVentanas=datos[1]*1000;
			}else{
				tiempoCierreVentanas=960000;
				inicializar =false;
			}
			
			timerId = setTimeout("doTimer('timeOut')",tiempoCierreVentanas);
		},
		error : function(params) 
		{
			cerrarVentanas();
		}
	});
	verificaSession=1;
	contador = contador + 1;
	reloj();*/
}

	function cerrarVentanas(){
			for(var i = 0; i < children.length; i++) 
			{
				if (children[i] != null && !children[i].closed) 
				{
					children[i].close();
				}
			}
			window.document.location = '/nok/jsp/noklogin.jsp?lg=cgam';
		}

// El metodo es una replica del metodo abrePopup de ammenu.js, solo se agrega una linea al final, 
// que se utiliza solo para esta pagina.
function openPopUp(liga, objproc, nombreventana, anchoventana, largoventana, _resize, _scrollbar) {
	var parametros = '';
	var ancho_pantalla = 0;
	var alto_pantalla = 0;
	var posx = 0;
	var posy = 0;
	
	ancho_pantalla = screen.availWidth;
	alto_pantalla = screen.availHeight;
	
	posx = (ancho_pantalla - anchoventana) / 2;
	posy = (alto_pantalla - largoventana) / 2;
	
	parametros = 'dependent=true,toolbar=no,menubar=no,status=no,directories=no,location=no,width=' + anchoventana + ',height=' + largoventana;
	if(_resize == 1) {
		parametros = parametros + ',resizable=1';
	}
	if(_scrollbar == 1) {
		parametros = parametros + ',scrollbars=1';
	}
	parametros = "'" + parametros + "'";
	
	ventana = window.open(liga, nombreventana, parametros);
	ventana.focus();
	ventana.moveTo(posx, posy);
	children.push(ventana);
	// llamada al metodo con parametro de valor indefinido 
	inicializar = true;
	verificaSession=0;
	doTimer();
}

function reloj() 
{
	fObj = new Date();
	var horas = fObj.getHours() ; 
	var minutos = fObj.getMinutes() ; 
	var segundos = fObj.getSeconds() ; 
	if (horas <= 9)
	{
		horas = "0" + horas; 
	}
	if (minutos <= 9)
	{
		minutos = "0" + minutos; 
	}
	if (segundos <= 9)
	{
		segundos = "0" + segundos; 
	}
	// window.status = "Ultima hora de peticion..." + horas+":"+minutos+":"+segundos + " ... Contador=" + contador + " - Fecha : " + fObj.getTime();
}

//Temporizador para mantener viva la sesion
function doRecargar() 
{
       var milisegundos = 840000; // 14 minutos
       timerId = setTimeout("doRedireccionar()",milisegundos);
}

function doRedireccionar()
{
	window.document.location = '/nok/jsp/noklogin.jsp?lg=cgam';
}
