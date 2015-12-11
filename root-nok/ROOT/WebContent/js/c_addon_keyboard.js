/*
========================================
 Advanced Keyboard Navigation v1.0
 Add-on for SmartMenus v6.0+
========================================
 (c)2008 ET VADIKOM-VASIL DINKOV
========================================
*/


c_keyboard={

'Menu1' : [
123,		// Hotkey ('',keyCode) (e.g. F1, F2, ... F11, F12 == 112, 113, ... 122, 123)
'shiftKey',	// HotkeyModifierKey(s) ('','single','multiple|multiple|...') (e.g. '', 'shiftKey', 'ctrlKey|altKey|shiftKey')
'nextPageLink'	// EscapeToElement ('','nextPageLink','JavaScript_expression_that_evaluates_to_an_element')
]

// You can configure keyboard access for another menu tree too (if you have more than 1) like this:
// ,'Menu2' : [ 122, 'shiftKey', 'document.getElementById("myInputField")' ]

};


// ===
c_adK={};c_adK.c_c=null;c_adK.eh=c_iE||c_sF||c_kN?"keydown":"keypress";c_adK.kPf=0;c_adK.fL=function(u){var l=u.firstChild;while(c_nN(l)!="LI")l=l.nextSibling;return l};c_adK.lL=function(u){var l=u.lastChild;while(c_nN(l)!="LI")l=l.previousSibling;return l};c_adK.pL=function(l,u){l=l.previousSibling;while(l&&c_nN(l)!="LI")l=l.previousSibling;return l||c_adK.lL(u)};c_adK.nL=function(l,u){l=l.nextSibling;while(l&&c_nN(l)!="LI")l=l.nextSibling;return l||c_adK.fL(u)};if(!Function.prototype.apply){Function.prototype.apply=function(o,a){var A=[],r;if(a)for(var i=0,l=a.length;i<l;i++)A[i]="a["+i+"]";if(!o)o=window;o.ApplY=this;r=eval("o.ApplY("+A.join(",")+")");o.ApplY=null;return r}};c_adK.oF=c_oF;c_oF=function(){c_adK.oF.apply(this);if(!c_gL(this).parentNode.PP)c_adK.c_c=this;if(this.ADK)c_hM(c_S[c_gL(this).parentNode.LV+1])};c_adK.oB=c_oB;c_oB=function(){c_adK.oB.apply(this);c_adK.c_c=null;if(this.ADK)this.ADK=0};c_adK.H=function(e){if(!e)e=event;var c,i,h,M,m,k,u,j,n,r;c=e.keyCode;for(i in c_keyboard){h=c_keyboard[i];if(c==parseInt(h[0])){M=["ctrlKey","shiftKey","altKey","metaKey"];m="|"+h[1]+"|";k=1;for(j=0,n=M.length;j<n;j++){r=M[j];if(m.indexOf("|"+r+"|")>-1&&!e[r]||m.indexOf("|"+r+"|")==-1&&e[r]){k=0;break}}u=c_gO(i);if(k&&u){c_gA(c_adK.fL(u)).focus();if(e.preventDefault)e.preventDefault();return false}k=0}}if(!c_c||c_c!=c_adK.c_c||!c_c.focus||c!=27&&c!=37&&c!=39&&c!=38&&c!=40)return true;if(c_sF||c_kN)c_adK.kPf=1;var l,R,uC,b;l=c_gL(c_c);u=l.parentNode;R=c_menus[u.MM][0][1]=="relative";uC=c_cA(u,c_oPo2||c_sF&&R);b=c_menus[u.MM][0][5];var us,as;us=[];as=[];if(u.LV>1){us[0]=[];us[0][0]=u.parentNode.parentNode;us[0][1]=c_gA(u.parentNode);var u0C=c_cA(us[0][0],c_oPo2||c_sF&&R);us[0][2]=u0C.x<uC.x;us[0][3]=u0C.y<uC.y}if(l.SH&&c_S[u.LV+1]&&c_S[u.LV+1].style.display!="none"){us[1]=[];us[1][0]=c_S[u.LV+1];us[1][1]=c_gA(c_adK.fL(us[1][0]));var u1C=c_cA(us[1][0],c_oPo2||c_sF&&R);us[1][2]=uC.x<u1C.x;us[1][3]=uC.y<u1C.y}as[0]=c_gA(c_adK.pL(l,u));as[1]=c_gA(c_adK.nL(l,u));switch(c){case 27:if(us[1]&&us[1][0]){c_hM(c_S[u.LV+1])}else{if(u.LV==1){if(c_keyboard[u.MM]&&c_keyboard[u.MM][2]!=""){var o;m=c_keyboard[u.MM][2];if(m=="nextPageLink"){if(!c_keyboard[u.MM][9]){var A,AL,AS,ASL;A=c_gT(u,"a");AL=A.length-1;i="ADK"+u.MM;A[AL][i]=1;AS=c_gT(c_d,"a");ASL=AS.length;for(j=AL;j<ASL;)if(AS[j++][i])break;c_keyboard[u.MM][9]=AS[j]||1}o=c_keyboard[u.MM][9]}else{try{o=eval(m)}catch(x){}}try{o.focus()}catch(x){}}}else{us[0][1].ADK=1;us[0][1].focus()}}break;case 37:if(u.LV==1&&u.HR)as[c_rightToLeft?1:0].focus();else if(us[1]&&!us[1][2])us[1][1].focus();else if((u.LV>2||u.LV>1&&!u.HR)&&us[0][2])us[0][1].focus();break;case 39:if(u.LV==1&&u.HR)as[c_rightToLeft?0:1].focus();else if(us[1]&&us[1][2])us[1][1].focus();else if((u.LV>2||u.LV>1&&!u.HR)&&!us[0][2])us[0][1].focus();break;case 38:if(u.LV==2&&u.HR&&!b&&l==c_adK.fL(u))us[0][1].focus();else if(u.LV==1&&u.HR&&us[1]&&b)us[1][1].focus();else if(u.LV>1||!u.HR)as[0].focus();break;default:if(u.LV==2&&u.HR&&b&&l==c_adK.lL(u))us[0][1].focus();else if(u.LV==1&&u.HR&&us[1]&&!b)us[1][1].focus();else if(u.LV>1||!u.HR)as[1].focus()}if(e.preventDefault)e.preventDefault();return false};if((!c_sF||c_sFv>=125)&&(!c_kN||c_kNv>=4)&&(!c_oP||c_oP9)){if(c_d.addEventListener)c_d.addEventListener(c_adK.eh,c_adK.H,0);else if(c_d.attachEvent)c_d.attachEvent("on"+c_adK.eh,c_adK.H);if(c_sF||c_kN){c_d.addEventListener("keypress",function(e){if(c_adK.kPf)e.preventDefault()},0);c_d.addEventListener("keyup",function(){c_adK.kPf=0},0)}}