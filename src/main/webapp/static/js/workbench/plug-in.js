var primaryData, primaryColor, secondaryData, secondaryColor, xAxisData;
primaryData = [64, 100, 62, 53, 61, 78, 56, 54, 100, 62, 40, 50];
primaryData_3 = [150, 650, 410, 880, 1330, 220, 1190, 494, 120, 650, 980];
primaryData_3 = [150, 650, 410, 880, 1330, 220, 1190, 494, 120, 650, 980];
primaryColor_1 = "#7bbef7";
primaryColor_2 = "#b57cbf";
primaryColor_3 = "#7bbef7";
primaryColor_4 = "#fbc989";
secondaryData = [22, 34, 32, 30, 50, 24, 51, 25, 50, 10, 25, 40];
secondaryColor = "#7ede63";

xAxisData_1 = ['<a href="#">全省</a>', '哈尔滨', '齐齐哈尔', '牡丹江', '佳木斯', '双鸭山', '七台河', '鸡西', '鹤岗', '伊春', '黑河', '绥化'];
xAxisData_2 = ['2017-01', '2017-02', '2017-03', '2017-04', '2017-05', '2017-06', '2017-07', '2017-08', '2017-09', '2017-10', '2017-11', '2017-12'];
xAxisData_3 = ['哈尔滨', '齐齐哈尔', '牡丹江', '佳木斯', '双鸭山', '七台河', '鸡西', '鹤岗', '伊春', '黑河', '绥化', '大兴安岭', '大庆'];
xAxisData_4 = ['房地产业', '采矿业', '制造业', '电气、燃气及', '建筑业', '交通运输、仓', '信息传输、计', '批发和零售业', '住宿和餐饮业', '金融业', '其他'];
$(function() {
    $(".section").each(function(index, element) {
        var targetH = $(this)[0].offsetHeight;
        var section1 = $(this).find('.chart_section').eq(0),
            section2 = $(this).find('.chart_section').eq(1);
        if (section1.outerHeight() + section2.outerHeight() - targetH > 0) {
            $(document.head).append($('<link href href="../../css/small_style.css" rel="stylesheet">'));
            return false;
        }
    });

    $(".chart_tab .chart_tab_head a").mouseover(function(e) {
        var index = $(this).index();
        var chartId = $(this).attr("data-chart");
        var chartStyle = $(this).attr("data-chartStyle");

        $(this).addClass("current").siblings("a").removeClass("current");
        $(this).closest(".chart_tab").find(".chart_tab_body .pane").eq(index).show().siblings(".pane").hide();
        if (chartStyle == "primaryColor_1" && chartId != 'chart_column_6' && chartId != 'chart_column_7' && chartId != 'chart_column_8') {
            drawChart_1(chartId, primaryData, primaryColor_1, secondaryData, secondaryColor, xAxisData_1);
        } else if (chartId != 'chart_column_6' && chartId != 'chart_column_7' && chartId != 'chart_column_8') {
            drawChart_1(chartId, primaryData, primaryColor_2, secondaryData, secondaryColor, xAxisData_2);
        } else {
            drawChart_2(chartId);
        }
    });
})
$(document).ready(function() {
    drawChart_1("chart_column_1", primaryData, primaryColor_1, secondaryData, secondaryColor, xAxisData_1); //banner
    drawChart_1("chart_column_5", primaryData, primaryColor_1, secondaryData, secondaryColor, xAxisData_2); //banner
    drawChart_3("chart_column_2", primaryData, primaryColor_2, secondaryData, secondaryColor, xAxisData_1); //最底部的紫色
    drawChart_2("chart_column_4", primaryData_3, primaryColor_1, xAxisData_3); //TOP-10
    drawChart_2("chart_column_3", primaryData_3, primaryColor_4, xAxisData_4); //TOP-10
    //drawChart_1("chart_column_5", primaryData, primaryColor_2, secondaryData, secondaryColor, xAxisData_2);

    $(".js_show_tab .js_tab_caption a").click(function() {
        var temp_id = $(this).parent().children("a").index($(this));
        var paneId = $(this).parent().next().children("div").eq(temp_id).find("div.pane").attr("id");
        drawChart_1(paneId, primaryData, primaryColor_1, secondaryData, secondaryColor, xAxisData_1);

    })

});

function drawChart_1(id, primaryData, primaryColor, secondaryData, secondaryColor, xAxisData) {
    $('#' + id).highcharts({
        chart: {
            zoomType: 'xy',
            backgroundColor: 'none',
            plotBackgroundColor: '#fff',
            plotBorderWidth: 1,
            //marginLeft:150,
            marginLeft: 30,
            marginRight: 0,
            borderWidth: 0
        },
        title: {
            text: false
        },
        credits: false,
        xAxis: [{
            categories: xAxisData,
            labels: {
                style: {
                    color: '#fff'
                }
            }
        }],
        yAxis: [{ //Primary  yAxis
            title: {
                text: false
            },
            labels: {
                format: '{value} ',
                style: {
                    color: '#fff'
                }
            }
        }, { // Secondary yAxis
            //labels: {
            //                  format: '{value}%',
            //                  style: {
            //                      color: '#fff'
            //                  }
            //              },
            title: {
                text: false
            },
            opposite: true
        }],
        tooltip: {
            shared: true
        },

        legend: {
            enabled: false
        },
        series: [{
            name: 'XX指标数',
            color: primaryColor,
            type: 'column',
            yAxis: 1,
            data: primaryData,
            tooltip: {
                valueSuffix: ' '
            }

        }, {
            name: '同比增幅',
            color: secondaryColor,
            type: 'spline',
            data: secondaryData,
            tooltip: {
                valueSuffix: '%'
            }
        }]
    });
}

function drawChart_2(id, primaryData, primaryColor, xAxisData) {
    $('#' + id).highcharts({
        chart: {
            type: 'bar',
            backgroundColor: 'none',
            plotBackgroundColor: '#fff',
            plotBorderWidth: 1,
            marginLeft: 80
        },
        title: {
            text: false
        },
        credits: false,
        xAxis: [{
            categories: xAxisData,
            labels: {
                style: {
                    color: '#000'
                }
            }
        }],
        yAxis: [{ //Primary  yAxis
            title: {
                text: false
            },
            labels: {
                format: '{value} 万',
                style: {
                    color: '#000'
                }
            }
        }, { // Secondary yAxis
            labels: {
                format: '{value}%',
                style: {
                    color: '#000'
                }
            },
            title: {
                text: false
            },
            opposite: true
        }],
        tooltip: {
            shared: true
        },

        legend: {
            enabled: false
        },
        plotOptions: {
            series: {
                stacking: 'normal'
            }
        },
        series: [{
            name: '指标项',
            color: primaryColor,
            data: primaryData
        }]
    });
}

function drawChart_3(id, primaryData, primaryColor, secondaryData, secondaryColor, xAxisData) {
    $('#' + id).highcharts({
        chart: {
            zoomType: 'xy',
            backgroundColor: 'none',
            plotBackgroundColor: '#fff',
            plotBorderWidth: 1,
            //marginLeft:150,
            marginLeft: 60,
            marginRight: 70,
            borderWidth: 0
        },
        title: {
            text: false
        },
        credits: false,
        xAxis: [{
            categories: xAxisData,
            labels: {
                style: {
                    color: '#000'
                }
            }
        }],
        yAxis: [{ //Primary  yAxis
            title: {
                text: false
            },
            labels: {
                format: '{value} 万',
                style: {
                    color: '#000'
                }
            }
        }, { // Secondary yAxis
            labels: {
                format: '{value}%',
                style: {
                    color: '#000'
                }
            },
            title: {
                text: false
            },
            opposite: true
        }],
        tooltip: {
            shared: true
        },

        legend: {
            enabled: false
        },
        series: [{
            name: 'XX指标数',
            color: primaryColor,
            type: 'column',
            yAxis: 1,
            data: primaryData,
            tooltip: {
                valueSuffix: ' 万'
            }

        }, {
            name: '同比增幅',
            color: secondaryColor,
            type: 'spline',
            data: secondaryData,
            tooltip: {
                valueSuffix: '%'
            }
        }]
    });
}
//星级评定
$(function() {
    var oStar = document.getElementById("star");
    var aLi = oStar.getElementsByTagName("li");
    var oUl = oStar.getElementsByTagName("ul")[0];
    var oSpan = oStar.getElementsByTagName("span")[1];
    var oP = oStar.getElementsByTagName("p")[0];
    var i = iScore = iStar = 0;
    var aMsg = [
        "很不满意|差得太离谱",
        "不满意|不满意",
        "一般|一般",
        "满意|很好",
        "非常满意|非常好"
    ]
    for (i = 1; i <= aLi.length; i++) {
        aLi[i - 1].index = i;
        //鼠标移过显示分数
        aLi[i - 1].onmouseover = function() {
            fnPoint(this.index);
            //浮动层显示
            oP.style.display = "block";
            //计算浮动层位置
            oP.style.left = oUl.offsetLeft + this.index * this.offsetWidth - 45 + "px";
            //匹配浮动层文字内容
            oP.innerHTML = "<em><b>" + this.index + "</b> 分 " + aMsg[this.index - 1].match(/(.+)\|/)[1] + "</em>" + aMsg[this.index - 1].match(/\|(.+)/)[1]
        };
        //鼠标离开后恢复上次评分
        aLi[i - 1].onmouseout = function() {
            fnPoint();
            //关闭浮动层
            oP.style.display = "none"
        };
        //点击后进行评分处理
        aLi[i - 1].onclick = function() {
            iStar = this.index;
            oP.style.display = "none";
            oSpan.innerHTML = "<strong>" + (this.index) + " 分</strong> (" + aMsg[this.index - 1].match(/\|(.+)/)[1] + ")"
        }
    }
    //评分处理
    function fnPoint(iArg) {
        //分数赋值
        iScore = iArg || iStar;
        for (i = 0; i < aLi.length; i++) aLi[i].className = i < iScore ? "on" : "";
    }
});
//星级评定1
$(function() {
    var oStar = document.getElementById("star1");
    var aLi = oStar.getElementsByTagName("li");
    var oUl = oStar.getElementsByTagName("ul")[0];
    var oSpan = oStar.getElementsByTagName("span")[1];
    var oP = oStar.getElementsByTagName("p")[0];
    var i = iScore = iStar1 = 0;
    var aMsg = [
        "很不满意|差得太离谱",
        "不满意|不满意",
        "一般|一般",
        "满意|很好",
        "非常满意|非常好"
    ]
    for (i = 1; i <= aLi.length; i++) {
        aLi[i - 1].index = i;
        //鼠标移过显示分数
        aLi[i - 1].onmouseover = function() {
            fnPoint(this.index);
            //浮动层显示
            oP.style.display = "block";
            //计算浮动层位置
            oP.style.left = oUl.offsetLeft + this.index * this.offsetWidth - 45 + "px";
            //匹配浮动层文字内容
            oP.innerHTML = "<em><b>" + this.index + "</b> 分 " + aMsg[this.index - 1].match(/(.+)\|/)[1] + "</em>" + aMsg[this.index - 1].match(/\|(.+)/)[1]
        };
        //鼠标离开后恢复上次评分
        aLi[i - 1].onmouseout = function() {
            fnPoint();
            //关闭浮动层
            oP.style.display = "none"
        };
        //点击后进行评分处理
        aLi[i - 1].onclick = function() {
            iStar1 = this.index;
            oP.style.display = "none";
            oSpan.innerHTML = "<strong>" + (this.index) + " 分</strong> (" + aMsg[this.index - 1].match(/\|(.+)/)[1] + ")"
        }
    }
    //评分处理
    function fnPoint(iArg) {
        //分数赋值
        iScore = iArg || iStar1;
        for (i = 0; i < aLi.length; i++) aLi[i].className = i < iScore ? "on" : "";
    }
});
//星级评定2
$(function() {
    var oStar = document.getElementById("star2");
    var aLi = oStar.getElementsByTagName("li");
    var oUl = oStar.getElementsByTagName("ul")[0];
    var oSpan = oStar.getElementsByTagName("span")[1];
    var oP = oStar.getElementsByTagName("p")[0];
    var i = iScore = iStar2 = 0;
    var aMsg = [
        "很不满意|差得太离谱",
        "不满意|不满意",
        "一般|一般",
        "满意|很好",
        "非常满意|非常好"
    ]
    for (i = 1; i <= aLi.length; i++) {
        aLi[i - 1].index = i;
        //鼠标移过显示分数
        aLi[i - 1].onmouseover = function() {
            fnPoint(this.index);
            //浮动层显示
            oP.style.display = "block";
            //计算浮动层位置
            oP.style.left = oUl.offsetLeft + this.index * this.offsetWidth - 45 + "px";
            //匹配浮动层文字内容
            oP.innerHTML = "<em><b>" + this.index + "</b> 分 " + aMsg[this.index - 1].match(/(.+)\|/)[1] + "</em>" + aMsg[this.index - 1].match(/\|(.+)/)[1]
        };
        //鼠标离开后恢复上次评分
        aLi[i - 1].onmouseout = function() {
            fnPoint();
            //关闭浮动层
            oP.style.display = "none"
        };
        //点击后进行评分处理
        aLi[i - 1].onclick = function() {
            iStar2 = this.index;
            oP.style.display = "none";
            oSpan.innerHTML = "<strong>" + (this.index) + " 分</strong> (" + aMsg[this.index - 1].match(/\|(.+)/)[1] + ")"
        }
    }
    //评分处理
    function fnPoint(iArg) {
        //分数赋值
        iScore = iArg || iStar2;
        for (i = 0; i < aLi.length; i++) aLi[i].className = i < iScore ? "on" : "";
    }
});
