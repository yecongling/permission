/**
 * 服务监控
 */
(function ($) {
    'use strict';
    $.serviceMonitor = {};

    $.extend($.serviceMonitor, {

        /**
         * 界面初始化
         */
        init : function () {
            this.initSysVersion();
        },

        /**
         * 查询系统版本
         */
        initSysVersion : function () {
            $.ajax({
                //请求方式
                type : "POST",
                //请求的媒体类型
                // contentType: "application/json;charset=UTF-8",
                dataType : 'JSON',
                //请求地址
                url : "/permission/sys/sysInfo.do",
                //请求成功
                success : function(data) {
                    console.log(data);
                },
                //请求失败，包含具体的错误信息
                error : function(e){
                    console.log(e.status);
                    console.log(e.responseText);
                }
            });
        }
    });
})(jQuery);