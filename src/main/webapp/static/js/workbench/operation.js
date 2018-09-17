/**
 * 
 * @authors Your Name (you@example.org)
 * @date    2016-02-29 10:47:47
 * @version $Id$
 */
var fixedAreaHeight = 0,
	iframeH = 0,
	winHeight = $(window).height(),
	tatolIndex = -1,
	currOneTabIndex = -1;//当前一级tab选中的索引
$(function(){
	opTabOneChange();
	opTabOneDel();
	autoNav();
	$(window).on('resize', function(event) {
		event.preventDefault();
		$(".J_opIframe").css("height", ($(window).height() - fixedAreaHeight) +"px");		
	});

	$("#J_opTabOneDown").on('click', function(event) {
		event.preventDefault();
		var opTabOneBoxH = $("#J_opTabOneBox").height();
		$("#J_opTabOneBox").stop(true, true).animate({'bottom': -opTabOneBoxH+"px"}, 300, function(){
			$("#J_opTabOneUp").stop(true, true).animate({'bottom': 0}, 300);
			/*$(".J_opIframe").css("height", (iframeH+opTabOneBoxH)+"px");*/
		});
	});

	$("#J_opTabOneUp").on('click', function(event) {
		event.preventDefault();
		var opTabOneBoxH = $("#J_opTabOneBox").height();
		$("#J_opTabOneUp").stop(true, true).animate({'bottom': -opTabOneBoxH+"px"}, 300, function(){
			$("#J_opTabOneBox").stop(true, true).animate({'bottom': 0}, 300);
		});
	});

	/*$("#J_opNav li.nav-sub-tab").hover(function() {
		var the = $(this),
		    offset = the.offset()
		    opNavBoxH = $("#J_opNavBox").height(),
		    opTabOneBoxH = $("#J_opTabOneBox").height(),
			opTopSubBnrBoxH = $("#J_opTopSubBnrBox").height(),
			opTopBnrBox = $("#J_opTopBnrBox").height()+10;
     	var boxH = $(window).height() - opNavBoxH - opTopSubBnrBoxH - opTopBnrBox - opTabOneBoxH;
		the.addClass('curr');
		the.siblings().removeClass('curr').find('.op-nav-sub-box').hide();
		the.find('.op-nav-sub-dl').css({"maxHeight": (boxH -60) +"px"});
     	the.find('.op-nav-sub-box').css({
     		'left': -offset.left+"px",
     		'width': $(window).width()+"px",
     		'height': boxH+"px"
     	}).show().stop(true, true).slideDown();
	}, function() {
		var the = $(this);
		the.removeClass('curr').find('.op-nav-sub-box').hide();
	});*/
	$("#J_opNav").on('click', 'li.nav-sub-tab', function(event) {
		event.preventDefault();
		var the = $(this),
		    offset = the.offset()
		    opNavBoxH = $("#J_opNavBox").height(),
		    opTabOneBoxH = $("#J_opTabOneBox").height(),
			opTopSubBnrBoxH = $("#J_opTopSubBnrBox").height(),
			opTopBnrBox = $("#J_opTopBnrBox").height()+10;
		if(!the.hasClass('curr')){
			the.siblings('li.nav-sub-tab').removeClass('curr');
			var boxH = $(window).height() - opNavBoxH - opTopSubBnrBoxH - opTopBnrBox - opTabOneBoxH;
			the.addClass('curr');
			the.siblings().removeClass('curr').find('.op-nav-sub-box').hide();
			the.find('.op-nav-sub-dl').css({"maxHeight": (boxH -60) +"px"});
	     	the.find('.op-nav-sub-box').css({
	     		'left': -offset.left+"px",
	     		'width': $(window).width()+"px",
	     		'height': boxH+"px"
	     	}).show().stop(true, true).slideDown();
		}
	});
	$("#J_opNav").hover(function() {
	}, function() {
		var the = $(this);
		the.find('li.nav-sub-tab').removeClass('curr');
		the.find('.op-nav-sub-box').hide();
	});

	$("#J_opNav").on('click', '.tab-one', function(event) {
		event.preventDefault();
		var name = $(this).attr('title');
		addTabOne(name);
	});

	$("#J_opNav").on('click', '.tab-two', function(event) {
		event.preventDefault();
		var name = $(this).attr('title');
		addTabTwo(name);
	});

	$("#J_opSchServBtn").on('click', function(event) {
		event.preventDefault();
		var val = $("#J_opSchServIpt").val();
		addTabOne(val);
	});

	$(document).on('keydown', function(event) {
		var e = event || window.event;
		if(e && e.keyCode==13){ 
            var val = $("#J_opSchServIpt").val();
			addTabOne(val);
        }
	});

	$(".src-dir-right").on('click', function(event) {
		event.preventDefault();
		var me = $(this),
			subTitleObj = me.siblings('.sub-tt-box').find('.title'),
			subTitleObjH = subTitleObj.height(),
			tatolPage = Math.ceil(subTitleObjH / 40),
			dataPage = subTitleObj.attr("data-page");
		if(!dataPage || dataPage == ""){
			var currPageNum = 0;
		}else{
			var currPageNum = parseInt(dataPage);
		}
		if(currPageNum < (tatolPage - 1)){
			currPageNum++;
			subTitleScroll(subTitleObj, currPageNum);
			subTitleObj.attr('data-page', currPageNum);
		}
	});
	$(".src-dir-left").on('click', function(event) {
		event.preventDefault();
		var me = $(this),
			subTitleObj = me.siblings('.sub-tt-box').find('.title'),
			subTitleObjH = subTitleObj.height(),
			tatolPage = Math.ceil(subTitleObjH / 40),
			dataPage = subTitleObj.attr("data-page");
		if(!dataPage || dataPage == ""){
			var currPageNum = 0;
			return false;
		}else{
			var currPageNum = parseInt(dataPage);
		}
		if(currPageNum > 0){
			currPageNum--;
			subTitleScroll(subTitleObj, currPageNum);
			subTitleObj.attr('data-page', currPageNum);
		}
	});
});
/*
**自动导航
*/
function autoNav(){
	var opNav = $("#J_opNav"),
		navLi = $("#J_opNav > li"),
		navLiLen = navLi.length,
		showNum = 8,
		moreLiHtml = [],
		ddHtml = [];
	if(($(window).width() < 1200)){
		if(navLiLen > showNum){
			console.log(1);
			for(var i = showNum; i < navLiLen; i++){
				moreLiHtml.push($("<p>").append(navLi.eq(i).clone()).html());
				ddHtml.push('<dd><a href="#">'+$.trim(navLi.eq(i).find("> a").text())+'</a></dd>');
				navLi.eq(i).remove();
			}
			opNav.data("moreLiHtml", moreLiHtml.join(""));
			$(".op-nav-more-dl").prepend(ddHtml.join(""));
		}
	}
}
/*
**自动获取iframe
*/
function autoGetIframeHeight(the){
	var opTabOneBoxH = $("#J_opTabOneBox").height(),
		//opTabTwoBoxH = $("#J_opTabTwoBox").height(),
		//opTabTwoBoxH = 43,
		opNavBoxH = $("#js_home").height(),
		opTabOneBox = $("#J_opTabOneBox").height(),
	fixedAreaHeight = opTabOneBoxH + opNavBoxH + opTabOneBox;
	iframeH =  winHeight - fixedAreaHeight;
	$(the).css("height", iframeH +"px");
}
/*
function autoGetIframeHeight(the){
	var opTabOneBoxH = $("#J_opTabOneBox").height(),
		//opTabTwoBoxH = $("#J_opTabTwoBox").height(),
		//opTabTwoBoxH = 43,
		opNavBoxH = $("#J_opNavBox").height(),
		opTopSubBnrBoxH = $("#J_opTopSubBnrBox").height(),
		opTopBnrBox = $("#J_opTopBnrBox").height();
	fixedAreaHeight = opTabOneBoxH + opNavBoxH + opTopSubBnrBoxH + opTopBnrBox;
	iframeH =  winHeight - fixedAreaHeight;
	$(the).css("height", iframeH +"px");
}
*/
/*
**TABONE切换
*/
function opTabOneChange(){
	$("#J_opTabOne").on('click', 'li', function(event) {
		event.preventDefault();
		var the = $(this);
		the.addClass('curr');
		the.siblings().removeClass('curr');
		var index = the.find(".close-btn").attr("data-index");
		$("#J_opIframeBox .default-index").addClass('hide');
		$("#J_opIframeBox .tab-one-body").addClass('hide');
		$("#J_opIframeBox").find('.one-body-'+index).removeClass('hide');
		currOneTabIndex = index;
	});
}
/*
**TABONE删除
*/
function opTabOneDel(){
	$("#J_opTabOne").on('click', '.close-btn', function(event) {
		event.preventDefault();
		var the = $(this);
		var index = the.attr("data-index");
		var delBodyObj = $("#J_opIframeBox").find('.one-body-'+index);
		delBodyObj.remove();
		the.parent().remove();
		if(the.parent().hasClass('curr')){
			$("#J_opIframeBox .tab-one-body").addClass('hide');
			$("#J_opIframeBox .default-index").removeClass('hide');
		}
		return false;
	});
}
/*
**TABONE ADD
*/
function addTabOne(name){
	tatolIndex++;
	$("#J_opTabOne li").removeClass('curr');
	$("#J_opTabOne").append('<li class="curr"><span class="name"> '+name+' </span><img class="close-btn" data-index="'+tatolIndex+'" src="../pub-ui/images/e0d3ce8ca02c7904a9d7ab444d88b0da.png"></li>');
	$("#J_opIframeBox .default-index").addClass('hide');
	$("#J_opIframeBox .tab-one-body").addClass('hide');
	createTabOneBody();
	opTabTwoChange();
	currOneTabIndex = tatolIndex;
}
/*
**创建TabOneBody
*/
function createTabOneBody(){
	var html = [];
	html.push('<div class="tab-one-body one-body-'+tatolIndex+'">');
        html.push('<div class="op-tab-two-box">');
            html.push('<div class="container">');
                html.push('<div class="mgl-10 mgr-10 clearfix" style="height:42px;">');
                    html.push('<ul class="fl clearfix op-tab-two">');
                        html.push('<li>');
                            html.push('<span class="name">');
                                html.push('客户首页');
                            html.push('</span>');
                        html.push('</li>');
                    html.push('</ul>');
                html.push('</div>');
            html.push('</div>');
        html.push('</div>');
        html.push('<div class="tab-two-body-box">');
        	html.push('<div class="tab-two-body">');
        		html.push('<iframe class="J_opIframe" onload="autoGetIframeHeight(this);" style="width: 100%; height:100%;" src="iframe.html" frameborder="0" scrolling="auto">');
        		html.push('</iframe>');
        	html.push('</div>');
        html.push('</div>');
        
    html.push('</div>');
    $("#J_opIframeBox").append(html.join(""));
}


/*
**TABTWO切换
*/
function opTabTwoChange(){
	$(".op-tab-two").on('click', 'li', function(event) {
		event.preventDefault();
		var the = $(this);
		the.addClass('curr');
		the.siblings().removeClass('curr');
		
		var index = the.find('.close-btn').attr("data-index");
		var currTabOneBody = $("#J_opIframeBox").find(".one-body-"+currOneTabIndex);
		currTabOneBody.find(".tab-two-body-box .tab-two-body").addClass('hide');
		if(the.index() == 0){
			currTabOneBody.find(".tab-two-body-box .tab-two-body").eq(0).removeClass('hide');
		}else{
			currTabOneBody.find(".tab-two-body-box").find(".two-body-"+index).removeClass('hide');
		}	
	});
}
/*
**TABTWO删除
*/
function opTabTwoDel(){
	$(".op-tab-two").on('click', '.close-btn', function(event) {
		event.preventDefault();
		var the = $(this);
		var index = the.attr("data-index");
		var currTabTwoBodys = $("#J_opIframeBox").find(".one-body-"+currOneTabIndex).find(".tab-two-body");
		console.log(index);
		if(the.parent().hasClass('curr')){
			$("#J_opIframeBox").find(".one-body-"+currOneTabIndex).find('.op-tab-two li').eq(0).addClass('curr');
			currTabTwoBodys.addClass('hide').eq(0).removeClass('hide');
		}
		$("#J_opIframeBox").find(".one-body-"+currOneTabIndex).find('.two-body-'+index).remove();
		the.parent().remove();
		return false;
	});
}

/*
**TABTWO ADD
*/
function addTabTwo(name){
	var currTabOneBody = $("#J_opIframeBox").find(".one-body-"+currOneTabIndex);
	var dataIndex = currTabOneBody.find(".op-tab-two li:last").find('.close-btn').attr("data-index");
	var lastIndex;
	if(dataIndex){
		var dataIndex = parseInt(dataIndex);
		lastIndex = dataIndex +1;
	}else{
		lastIndex = 1;
	}
	currTabOneBody.find(".op-tab-two li").removeClass('curr');
	currTabOneBody.find(".op-tab-two").append('<li class="curr"><span class="name">'+name+'</span><img class="close-btn" data-index="'+lastIndex+'" src="../pub-ui/images/e0d3ce8ca02c7904a9d7ab444d88b0da.png"></li>');

	currTabOneBody.find(".tab-two-body-box .tab-two-body").addClass('hide');
	currTabOneBody.find(".tab-two-body-box").append('<div class="tab-two-body two-body-'+lastIndex+'"><iframe class="J_opIframe" onload="autoGetIframeHeight(this);" style="width: 100%;" src="iframe.html" frameborder="0" scrolling="auto"></iframe></div>');
	opTabTwoDel();
}

function subTitleScroll(subTitleObj, currPageNum){
	subTitleObj.animate({marginTop: -(currPageNum * 40) + "px"}, 350);
}
