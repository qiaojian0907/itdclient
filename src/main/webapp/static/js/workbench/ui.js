// JavaScript Document
/*首页导航*/
$(function(){
	$("#nav li").hover(function(){
		$(this).addClass("hover").siblings("li").removeClass("hover");
	},function(){
		$(this).removeClass("hover");
	});
})

//领导首页收起折叠
$(function(){	
	$(".js_fold").toggle(toggletip,toggletip);
	$(".js_fold2").toggle(toggletip,toggletip);
	$(".js_fold3").toggle(toggletip,toggletip);
	$(".js_fold4").toggle(toggletip,toggletip);
	function toggletip(){
		if ($(this).attr("class").split("fold-close").length > 1) {
			$(this).removeClass("fold-close").addClass("fold");
			$(this).parent().next(".js_foldCon").show();;
		} else {
			$(this).removeClass("fold").addClass("fold-close");
			$(this).parent().next(".js_foldCon").hide();
		}
	};	
})

//集团账单
$(function(){
	$(".js_fold5").toggle(toggletip,toggletip);
	$(".js_fold6").toggle(toggletip,toggletip);
	function toggletip(){
		if ($(this).attr("class").split("fold-close").length > 1) {
			$(this).removeClass("fold-close").addClass("fold");
			$(this).parent().parent().next(".js_foldCon").show();;
		} else {
			$(this).removeClass("fold").addClass("fold-close");
			$(this).parent().parent().next(".js_foldCon").hide();
		}
	};
})

//领导首页banner tab切换
$(function(){
	ui_common_tab(".js_show_tab .js_tab_caption a");//通用tab，点击效果
})
//通用tab，点击效果
function ui_common_tab(obj){
    $(obj).click(function () {
        $(this).parent().find(".on").removeClass("on");
        $(this).addClass("on");
        var temp_id = $(this).parent().children("a").index($(this));
        $(this).parent().next().children("div").css("display", "none");
        $(this).parent().next().children("div").eq(temp_id).css("display", "block");
        
    })
}

$(function(){
	//note hlx
	//$(".js_hover").hover(function(){
//		$(".all-prav").css({display:'block'});
//	},function(){
//		$(".all-prav").css({display:'none'});
//	})
//	
//	$(".js_hover2").hover(function(){
//		$(".all-prav2").css({display:'block'});
//	},function(){
//		$(".all-prav2").css({display:'none'});
//	})

	//鼠标悬停显示下拉框-add hlx
		$(".js_hover").hover(function(){
			var _this = $(this);
			_this.children(".js_hovertt").addClass("hovertt-cur");
			_this.children(".js_hoverCont").css({display:'block'});
		},function(){
			var _this = $(this);
			_this.children(".js_hovertt").removeClass("hovertt-cur")
			_this.children("div.js_hoverCont").css({display:'none'});
		})
	
})

