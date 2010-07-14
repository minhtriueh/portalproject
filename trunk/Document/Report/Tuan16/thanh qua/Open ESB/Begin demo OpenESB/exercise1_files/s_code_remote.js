/* SiteCatalyst code version: H.14. Copyright Omniture, Inc. More info available at http://www.omniture.com */
/* Author: Neil Evans */
/************************** CONFIG SECTION ****************************************/
/* Specify the Report Suite(s) */
var s_account="sunjnetdev";
var sun_dynamicAccountSelection=true;
var sun_dynamicAccountList="sunglobal,sunjnet=java.net;sunjnetdev=.";
/* Specify the Report Suite ID */
var s_siteid ="jnet-projects:"
if(window.location.href.indexOf('www.dev.java.net/servlets/')>-1) {var s_siteid="jnet-projects-admin:";}
if(window.location.host+window.location.pathname == "www.dev.java.net/files") {var s_siteid="jnet-projects-admin:";}
if(window.location.host+window.location.pathname == "www.dev.java.net/docs/ProjectOwnerCustomStyle.html.en") {var s_siteid="jnet-projects-admin:";}
if(window.location.host+window.location.pathname == "www.dev.java.net/file") {var s_siteid="jnet-projects-admin:";}
if(window.location.host+window.location.pathname == "www.dev.java.net/file/Documents") {var s_siteid="jnet-projects-admin:";}
if(window.location.host+window.location.pathname == "www.dev.java.net/complib/v2/auto-complete.html") {var s_siteid="jnet-projects-admin:";}
if(window.location.host+window.location.pathname == "www.dev.java.net/hudson") {var s_siteid="jnet-projects-admin:";}
if(typeof s_siteid=='undefined') {var s_siteid="suncom-error:";}
/* Settings for pageName */
if (typeof s_pageType=='undefined' || s_pageType=="") {
var s_pageName=window.location.host+window.location.pathname;
}
/* Remote Omniture JS call  */
var sun_ssl=(window.location.protocol.toLowerCase().indexOf("https")!=-1);
	if(sun_ssl == true) { var fullURL = "https://www.sun.com/share/metrics/metrics_group1.js"; }
		else { var fullURL= "http://www-cdn.sun.com/share/metrics/metrics_group1.js"; }
document.write("<sc" + "ript type=\"text/javascript\" src=\""+fullURL+"\"></sc" + "ript>");
/************************** END CONFIG SECTION **************************************/