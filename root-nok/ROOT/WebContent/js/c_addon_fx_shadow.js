/*
========================================
 Shadow Effect v1.0.1
 Add-on for SmartMenus v6.0.2+
========================================
 (c)2008 ET VADIKOM-VASIL DINKOV
========================================
*/


c_shadow_offset=5; // pixels
c_shadow_color="#333333";
c_shadow_opacity=60; // 0-100 percent
c_shadow_direction=0; // 0-right, 1-left


// ===
c_fxH={};if(c_nS){c_fxH.t="marginTop";c_fxH.l="marginLeft"}else{c_fxH.t="top";c_fxH.l="left"};c_fxH.k=((!c_oP||!c_oPo2)&&(!c_gC||c_pS>=20020530));c_fxH.s=function(u){var s=u.previousSibling;while(s.className!="SM6SH")s=s.previousSibling;return s};c_fxH.sH=c_sH;c_sH=function(u){if(c_fxH.k){if(!u.FXS){var l,s,c;l=u.parentNode;s=c_cE("span",l);c="display:none;position:absolute;top:auto;left:auto;background:"+c_shadow_color+";z-index:11110;font-size:1px;"+(!c_sF||c_sFv>=400?((!c_gC||c_pS>=20040616?"":"-moz-")+"opacity:"+(c_shadow_opacity/100)+";"):"")+(c_iEW?"filter:alpha(opacity="+c_shadow_opacity+");":"")+(typeof c_slide_steps!=c_u&&c_fxS.k?"clip:rect(0,0,0,0);":"");c_iE?s.style.cssText=c:s.setAttribute("style",c);s.className="SM6SH";l.insertBefore(s,u);u.FXS=1}var S,p;S=(typeof s!=c_u?s:c_fxH.s(u)).style;p=(u.PP&&u.LV==1);if(p)S.zIndex=10899;S.width=u.offsetWidth+"px";S.height=u.offsetHeight+"px";S[p?"left":c_fxH.l]=parseInt(u.style[p?"left":c_fxH.l])+(c_shadow_direction?-c_shadow_offset:c_shadow_offset)+"px";S[p?"top":c_fxH.t]=parseInt(u.style[p?"top":c_fxH.t])+c_shadow_offset+"px";if(c_iEW&&c_iA[u.IF]){var o=c_iA[u.IF].style;o.pixelWidth+=c_shadow_offset;o.pixelHeight+=c_shadow_offset;if(c_shadow_direction)o.pixelLeft-=c_shadow_offset}}c_fxH.sH(u);if(c_fxH.k)S.display="block"};c_fxH.hM=c_hM;c_hM=function(o,f){if(c_fxH.k)c_fxH.s(o).style.display="none";c_fxH.hM(o,f)}