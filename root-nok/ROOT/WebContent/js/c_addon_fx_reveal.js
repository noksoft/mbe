/*
========================================
 Reveal Animation v1.0.1
 Add-on for SmartMenus v6.0.2+
========================================
 (c)2008 ET VADIKOM-VASIL DINKOV
========================================
*/


c_reveal_steps=5;
c_reveal_speedGain=0.3; // with each step (pixels)
c_reveal_direction=3; // Possible values:
// 1-auto-vertical/horizontal, 2-auto-diagonal, 3-box-inside-out,
// 4-top-bottom, 5-bottom-top, 6-left-right, 7-right-left,
// 8-diagonal-bottom-right, 9-diagonal-bottom-left,
// 10-diagonal-top-right, 11-diagonal-top-left


// ===
c_fxR={};if(c_nS){c_fxR.t="marginTop";c_fxR.l="marginLeft"}else{c_fxR.t="top";c_fxR.l="left"};c_fxR.k=(!c_iEM&&(!c_gC||c_pS>=20020530)&&(!c_oP||c_oPv>=7.5));c_fxR.b=[];c_fxR.O=function(u){if(!u.FX){var i=0,U,US=c_gT(u,"ul");for(;i<US.length;){U=US[i++];U.style.display="none";U.FX=1}u.FX=1}this.u=u;this.s=u.style;this.d=c_reveal_direction;if(this.d==1||this.d==2){var r=(parseInt(this.s[c_fxR.l])<0);if(this.d==1)this.d=u.HR&&u.LV==2||u.PP&&u.LV==1?u.BT?5:4:r?7:6;else this.d=u.BT?(r?11:10):(r?9:8)}this.w=u.offsetWidth;this.h=u.offsetHeight;if(c_reveal_direction==3){this.w/=2;this.h/=2}if(this.w<c_reveal_steps)this.w=c_reveal_steps;if(this.h<c_reveal_steps)this.h=c_reveal_steps;this.iW=this.w/c_reveal_steps;this.iH=this.h/c_reveal_steps;this.dW=0;this.dH=0;this.s.clip="rect(0,0,0,0)"};c_fxR.O.prototype.S=function(i){if(typeof c_shadow_offset!=c_u&&!this.H)try{this.H=c_fxH.s(this.u).style}catch(e){};this.iW+=c_reveal_speedGain;this.iH+=c_reveal_speedGain;this.dW=this.dW+this.iW;this.dH=this.dH+this.iH;this.cW=parseInt(this.dW);this.cH=parseInt(this.dH);if(this.cW>=this.w||this.cH>=this.h){if(this.s.removeProperty&&!c_gCo){this.s.removeProperty("clip");if(this.H)this.H.removeProperty("clip")}else{this.s.clip="rect(auto,auto,auto,auto)";if(this.H)this.H.clip="rect(auto,auto,auto,auto)"}delete c_fxR.b[i];return}this.C="rect("+(/3|5|10|11/.test(this.d)?this.h-this.cH:0)+"px,"+(this.d==3?this.w+this.cW:/4|5|7|9|11/.test(this.d)?99999:this.cW)+"px,"+(this.d==3?this.h+this.cH:/4|8|9/.test(this.d)?this.cH:99999)+"px,"+(/3|7|9|11/.test(this.d)?this.w-this.cW:0)+"px)";this.s.clip=this.C;if(this.H)this.H.clip=this.C;this.t=setTimeout("c_fxR.b["+i+"].S("+i+")",10)};c_fxR.sH=c_sH;c_sH=function(u){if(c_fxR.k){var i=0;while(c_fxR.b[i]!=null)i++;c_fxR.b[i]=new c_fxR.O(u)}c_fxR.sH(u);if(c_fxR.k)c_fxR.b[i].S(i)}