function getHttpRequest()
{
    if (typeof XMLHttpRequest != "undefined") 
    {
        return new XMLHttpRequest();
    } else if (window.ActiveXObject) 
    {
      aVersions = ["MSXML2.XMLHttp.5.0","MSXML2.XMLHttp.4.0","MSXML2.XMLHttp.3.0","MSXML2.XMLHttp","Microsoft.XMLHttp"];
      for (var i = 0; i < aVersions.length; i++) 
      {
        try {
            oXmlHttp = new ActiveXObject(aVersions[i]);
            return oXmlHttp;
        } catch (oError) {}
      }
    }else 
    {
     alert("No se pudo crear el objeto XMLHttpRequest en este navegador");
     return null;
    }
}