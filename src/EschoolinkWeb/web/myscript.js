var rootURL='http://localhost:8080/EschoolinkWeb/';
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