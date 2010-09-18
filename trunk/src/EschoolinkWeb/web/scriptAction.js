var viewHistory=function(){
    var urlIn=rootURL+'viewHistory';
        var log=$('log');
        var dataIn={};
        var callAjax=function(){
            ajaxRequest(urlIn,log,dataIn);
        };
        callAjax();
        callAjax.periodical(5000);
}

var loadMessageAtStation= function(station){
    var urlIn=rootURL+'viewMessWaitting';
        var log=$('log');
        var dataIn={'station':station};
        var callAjax=function(){
            if(refresh){
                ajaxRequest(urlIn,log,dataIn);
            }
        };
        callAjax();
        callAjax.periodical(5000);
}

var processMessage= function(station){
     $$('.item').each(function(it){
            var traLoi=it.getElement('textarea');

            var btForward=it.getElements('input')[0];
            var btFeedback=it.getElements('input')[1];

            traLoi.addEvents({
                'focus' : function(){
                    refresh=false;
                }
            });

            btFeedback.addEvent('click',function(){
                setProcessBackGround(it);
                refresh=false;
                var alt=this.get('alt').split(' ');
                var idMess=alt[0];
                var idMessToStation=alt[1];

                var urlIn=rootURL+'StationUpdateState';
                var log=$('clear');
                var dataIn={'station':station,
                    'state':'feedback',
                    'note':'',
                    'traloi':traLoi.value,
                    'id':idMessToStation,
                    'idMess':idMess
                };
                var successF=function(){
                    refresh=true;
                }
                ajaxRequestF(urlIn,log,dataIn,successF);
            });
            btForward.addEvent('click',function(){
                setProcessBackGround(it);
                refresh=false;
                var alt=this.get('alt').split(' ');
                var idMess=alt[0];
                var idMessToStation=alt[1];

                var urlIn=rootURL+'StationUpdateState';
                var log=$('clear');
                var dataIn={'station':station,
                    'state':'forward',
                    'note':'',
                    'traloi':traLoi.value,
                    'id':idMessToStation,
                    'idMess':idMess
                };
                var successF=function(){
                    refresh=true;
                }
                ajaxRequestF(urlIn,log,dataIn,successF);
            });
        });
}
    var setProcessBackGround=function(div){
        var listDivIn=div.getElements('div');
        listDivIn.each(function(it){
            it.setStyle('display','none');
            it.setStyle('height','50px');
            
        });
        div.setStyle('background', 'url(images/3237826775_68bcfc44b2_o.gif) no-repeat center');
    }