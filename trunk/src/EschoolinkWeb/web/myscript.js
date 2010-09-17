var rootURL=location.protocol + '//' + location.host+'/EschoolinkWeb/';
var refresh=true;
function ajaxLoading(dom){
	dom.empty();
	dom.setStyle('min-height','300px');
	dom.setStyle('background', 'url(images/loading2.gif) no-repeat center');
}
function ajaxUnloading(dom){
	dom.setStyle('height', 'auto');
	dom.setStyle('background', 'none');
}
function showObj(dom){
	dom.style.display='';
}
function isShowObj(dom){
	if(dom.style.display=='') return true;
	else return false;
}
function hideObj(dom){
	dom.style.display='none';
}
function isHideObj(dom){
	if(dom.style.display=='none') return true;
	else return false;
}


function requestBasic(urlIn,log,dataIn){
	ajaxLoading(log);
	new Request.HTML({
		url: urlIn,
		method: 'post',
		data: dataIn,
		update: log,
		onStart: function(){
		},
		onSuccess: function(responseTree, responseElements, responseHTML, responseJavaScript){
			ajaxUnloading(log);
		}
	}).send();
}
function ajaxRequest(urlIn,log,dataIn){

	new Request.HTML({
		url: urlIn,
		method: 'post',
		data: dataIn,
		update: log,
		onStart: function(){
		},
		onSuccess: function(responseTree, responseElements, responseHTML, responseJavaScript){
			
		}
	}).send();
}
function ajaxRequestF(urlIn,log,dataIn,successF){
	new Request.HTML({
		url: urlIn,
		method: 'post',
		data: dataIn,
		update: log,
		onStart: function(){
		},
		onSuccess: function(responseTree, responseElements, responseHTML, responseJavaScript){
			successF();
		}
	}).send();
}
function requestAdv(urlIn,log,dataIn,successF){
	ajaxLoading(log);
	new Request.HTML({
		url: urlIn,
		method: 'post',
		data: dataIn,
		update: log,
		onSuccess: function(responseTree, responseElements, responseHTML, responseJavaScript){
			ajaxUnloading(log);
			successF();
		}
	}).send();
}
//Dang JAVASCRIPT

function Back(index)
{
    history.go(0-index);
}
function Forward(index)
{
    history.go(+index);
}

function IsNumeric(strString)
   //  check for valid numeric strings
   {
   var strValidChars = "0123456789";
   var strChar;
   var blnResult = true;

   if (strString.length == 0) return false;

   //  test strString consists of valid characters listed above
   for (i = 0; i < strString.length && blnResult == true; i++)
      {
      strChar = strString.charAt(i);
      if (strValidChars.indexOf(strChar) == -1)
         {
         blnResult = false;
         }
      }
   return blnResult;
   }

function isNull(input)
{
    return(input=="");
}