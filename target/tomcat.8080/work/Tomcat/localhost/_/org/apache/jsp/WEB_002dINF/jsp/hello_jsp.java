/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.40
 * Generated at: 2013-09-18 09:46:06 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class hello_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(4);
    _jspx_dependants.put("/WEB-INF/jsp/js/loadJS.jsp", Long.valueOf(1379497534000L));
    _jspx_dependants.put("/WEB-INF/jsp/NavigationBar/navbar.jsp", Long.valueOf(1378625020000L));
    _jspx_dependants.put("/WEB-INF/jsp/include.jsp", Long.valueOf(1378572632000L));
    _jspx_dependants.put("/WEB-INF/jsp/js/pageJS.jsp", Long.valueOf(1378620038000L));
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.release();
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, false, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("  <head>\r\n");
      out.write("\t<title>Hello :: Spring Application</title>\r\n");
      out.write("\t<link type=\"text/css\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${path}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/resources/css/bootstrap.min.css\" rel=\"stylesheet\"/>\r\n");
      out.write("\t");
      out.write("<script>\r\n");
      out.write("(function(){(function(){(window.P={}).error=function(h,g,m){throw Error(\"[aui] \"+h+\" @ \"+(g||\"N/A\")+\":\"+(m||\"N/A\"));}})();(function(){function h(b){o.schedule(function(){var a=[];if(b.dependencies&&b.dependencies.length!==0)for(var c=0;c<b.dependencies.length;c++)a.push(p[b.dependencies[c]]);if(b.fn&&typeof b.fn===\"function\")try{p[b.name]=b.fn.apply(window,a),f[b.name]=!0,d.notify(b)}catch(i){e.error(\"[\"+b.name+\"] had an error: \"+i.message,\"P\",\"initComponent\")}else f[b.name]=!0,d.notify(b)})}function g(b,\r\n");
      out.write("a,c){typeof f[a]!==\"undefined\"&&e.error(\"A component named \"+a+\" has already been registered.\",\"P\",\"register\");f[a]=!1;a={name:a,dependencies:b,fn:c};if(!b||b.length===0)h(a);else{for(var c=!0,i=0;i<b.length;i++)f[b[i]]||(c=!1);c?h(a):d.wait(a)}}function m(b,a){if(j[b])return!0;j[b]=!0;if(a instanceof Array){for(var c=0;c<a.length;c++)k[a[c]]&&e.error(\"An asset that contains \"+a[c]+\" has already been loaded.\",\"P\",\"alreadyLoaded\");for(c=0;c<a.length;c++)k[a[c]]=!0}return!1}var j={},k={},p={},f={},\r\n");
      out.write("l=0,n,e=window.P;e.AUI_BUILD_DATE=\"07252013\";var o=function(){function b(){for(var e=setTimeout(b,0),f=Date.now();;){if(i.length===0){clearTimeout(e);d=!1;break}i.shift().call();if(Date.now()-f>=a){clearTimeout(e);setTimeout(b,c);break}}}if(!Date.now)Date.now=function(){return(new Date).getTime()};var a=50,c=50,i=[],d=!1;typeof window.addEventListener===\"function\"&&window.addEventListener(\"scroll\",function(){setTimeout(b,0)},!1);return{schedule:function(a){i.push(a);d||(setTimeout(b,0),d=!0)}}}(),\r\n");
      out.write("d=function(){var b={},a={};return{wait:function(c){for(var d=0;d<c.dependencies.length;d++){var e=c.dependencies[d];f[e]||(b[e]=b[e]||[],a[c.name]=a[c.name]||0,b[e].push(c),a[c.name]++)}},notify:function(c){var d=b[c.name],e;if(d){for(var f=0;f<d.length;f++)e=d[f],a[e.name]--,a[e.name]===0&&h(e);delete b[c.name]}}}}();e.when=function(){var b=arguments;return{register:function(a,c){g(b,a,c)},execute:function(a,c){typeof a===\"function\"&&(c=a,a=\"anon\"+l++);g(b,a,c)}}};e.execute=function(b,a){typeof b===\r\n");
      out.write("\"function\"&&(a=b,b=\"anon\"+l++);g(null,b,a)};e.register=function(b,a){g(null,b,a)};e.trigger=function(b,a){var c=Date.now(),d={data:a,pageElapsedTime:window.aPageStart?c-window.aPageStart:NaN,triggerTime:c};g(null,b,function(){return d});typeof n===\"function\"&&n(b,d)};e.handleTriggers=function(b){typeof n===\"function\"&&e.error(\"Trigger handler already registered\",\"P\",\"handleTriggers\");n=b};e.load={js:function(b,a){if(m(b,a))return!1;var c=document.createElement(\"script\");c.type=\"text/javascript\";c.src=\r\n");
      out.write("b;c.async=!0;document.getElementsByTagName(\"head\")[0].appendChild(c);return!0},css:function(b,a){if(m(b,a))return!1;var c=document.createElement(\"link\");c.type=\"text/css\";c.rel=\"stylesheet\";c.href=b;document.getElementsByTagName(\"head\")[0].appendChild(c)}}})();P.register(\"p-detect\",function(){function h(d,b){var a=d.className;a+=\" \"+b;d.className=a}function g(d,b){for(var a=d.className.split(\" \"),c=0;c<a.length;c++)a[c]===b&&a.splice(c,1);d.className=a.join(\" \")}function m(){var d,b;window.innerWidth?\r\n");
      out.write("(d=window.innerWidth,b=window.innerHeight):(d=document.documentElement.clientWidth,b=document.documentElement.clientHeight);var a=!1,a=l.orientation?d>b:d>=1250;g(j,\"a-ws\");a&&h(j,\"a-ws\")}var j=document.getElementsByTagName(\"html\")[0],k;try{k=navigator.userAgent}catch(p){k=\"\"}var f=function(){var d=\"Webkit,Moz,O,ms,Khtml\".split(\",\"),b=document.createElement(\"div\");return{testGradients:function(){b.style.cssText=(\"background-image:\"+\"-webkit- \".split(\" \").join(\"gradient(linear,left top,right bottom,from(#9f9),to(white));background-image:\")+\r\n");
      out.write("d.join(\"linear-gradient(left top,#9f9, white);background-image:\")).slice(0,-17);return b.style.backgroundImage.indexOf(\"gradient\")!==-1},test:function(a){for(var c=a.charAt(0).toUpperCase()+a.substr(1),a=(a+\" \"+d.join(c+\" \")+c).split(\" \"),c=0;c<a.length;c++)if(b.style[a[c]]===\"\")return!0;return!1},testTransform3d:function(){var a=!1;if(window.matchMedia)a=window.matchMedia(\"(-webkit-transform-3d)\").matches;return a},testTouchScrolling:function(){var a=k.match(/android [3-9]/i);return k.match(/OS [5-8](_\\d)+ like Mac OS X/i)||\r\n");
      out.write("a}}}(),l={audio:!!document.createElement(\"audio\").canPlayType,video:!!document.createElement(\"video\").canPlayType,canvas:!!document.createElement(\"canvas\").getContext,offline:navigator.hasOwnProperty&&navigator.hasOwnProperty(\"onLine\")&&navigator.onLine,dragDrop:\"draggable\"in document.createElement(\"span\"),geolocation:!!navigator.geolocation,history:!(!window.history||!window.history.pushState),autofocus:\"autofocus\"in document.createElement(\"input\"),inputPlaceholder:\"placeholder\"in document.createElement(\"input\"),\r\n");
      out.write("textareaPlaceholder:\"placeholder\"in document.createElement(\"textarea\"),localStorage:\"localStorage\"in window&&window.localStorage!==null,orientation:\"orientation\"in window,touch:\"ontouchend\"in document,touchScrolling:f.testTouchScrolling(),gradients:f.testGradients(),hires:window.devicePixelRatio&&window.devicePixelRatio>=1.5,transform3d:f.testTransform3d(),ios:!!k.match(/OS [1-9](_\\d)+ like Mac OS X/i),android:!!k.match(/android [1-9]/i)},n=\"textShadow textStroke boxShadow borderRadius borderImage opacity transform transition\".split(\" \"),\r\n");
      out.write("e=0;for(;e<n.length;e++)l[n[e]]=f.test(n[e]);m();typeof window.addEventListener===\"function\"?window.addEventListener(\"resize\",m,!1):window.attachEvent(\"onresize\",m);g(j,\"a-no-js\");h(j,\"a-js\");for(var o in l)l.hasOwnProperty(o)&&l[o]&&h(j,\"a-\"+o.replace(/([A-Z])/g,function(d){return\"-\"+d.toLowerCase()}));j.setAttribute(\"data-aui-build-date\",P.BUILD_DATE);return{capabilities:l}})})();\r\n");
      out.write("</script>");
      out.write("\r\n");
      out.write("  </head>\r\n");
      out.write("  <body>\r\n");
      out.write("    ");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<nav class=\"navbar navbar-default\" role=\"navigation\">\r\n");
      out.write("  <!-- Brand and toggle get grouped for better mobile display -->\r\n");
      out.write("  <div class=\"navbar-header\">\r\n");
      out.write("    <button type=\"button\" class=\"navbar-toggle\" data-toggle=\"collapse\" data-target=\".navbar-ex1-collapse\">\r\n");
      out.write("      <span class=\"sr-only\">Toggle navigation</span>\r\n");
      out.write("      <span class=\"icon-bar\"></span>\r\n");
      out.write("      <span class=\"icon-bar\"></span>\r\n");
      out.write("      <span class=\"icon-bar\"></span>\r\n");
      out.write("    </button>\r\n");
      out.write("    <a class=\"navbar-brand\" href=\"#\">Deals..</a>\r\n");
      out.write("  </div>\r\n");
      out.write("\r\n");
      out.write("  <!-- Collect the nav links, forms, and other content for toggling -->\r\n");
      out.write("  <div class=\"collapse navbar-collapse navbar-ex1-collapse\">\r\n");
      out.write("    <ul class=\"nav navbar-nav\">\r\n");
      out.write("      <li class=\"dropdown\">\r\n");
      out.write("        <a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\">Categories <b class=\"caret\"></b></a>\r\n");
      out.write("        <ul class=\"dropdown-menu\">\r\n");
      out.write("          <li><a href=\"#\">Restaurants</a></li>\r\n");
      out.write("          <li><a href=\"#\">Spa and Saloon</a></li>\r\n");
      out.write("          <li><a href=\"#\">Personal Care and Wellness</a></li>\r\n");
      out.write("          <li><a href=\"#\">Jewelry</a></li>\r\n");
      out.write("          <li><a href=\"#\">Men and Women's Clothing</a></li>\r\n");
      out.write("\t\t  <li><a href=\"#\">Footwear</a></li>\r\n");
      out.write("\t\t  <li><a href=\"#\">Mobile and Tablets</a></li>\r\n");
      out.write("        </ul>\r\n");
      out.write("      </li>\r\n");
      out.write("    </ul>\r\n");
      out.write("    <form class=\"navbar-form navbar-left\" role=\"search\">\r\n");
      out.write("      <div class=\"form-group\">\r\n");
      out.write("        <input type=\"text\" class=\"form-control\" placeholder=\"Search\">\r\n");
      out.write("      </div>\r\n");
      out.write("      <button type=\"submit\" class=\"btn btn-default\">Submit</button>\r\n");
      out.write("    </form>\r\n");
      out.write("    <ul class=\"nav navbar-nav navbar-right\">\r\n");
      out.write("      <li><a href=\"#\">Sign In</a></li>\r\n");
      out.write("      <li class=\"dropdown\">\r\n");
      out.write("        <a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\">Account <b class=\"caret\"></b></a>\r\n");
      out.write("        <ul class=\"dropdown-menu\">\r\n");
      out.write("          <li><a href=\"#\">Change Password</a></li>\r\n");
      out.write("          <li><a href=\"#\">Past Deals</a></li>\r\n");
      out.write("          <li><a href=\"#\">Wallet</a></li>\r\n");
      out.write("        </ul>\r\n");
      out.write("      </li>\r\n");
      out.write("    </ul>\r\n");
      out.write("  </div><!-- /.navbar-collapse -->\r\n");
      out.write("</nav>");
      out.write("\r\n");
      out.write("\t\r\n");
      out.write("    <h1>Hello - Spring Application</h1>\r\n");
      out.write("    <p>Greetings, it is now ");
      if (_jspx_meth_c_005fout_005f0(_jspx_page_context))
        return;
      out.write("</p>\r\n");
      out.write("\t\r\n");
      out.write("\t");
      out.write("\t<script>\r\n");
      out.write("    function loadJS(src, callback) {\r\n");
      out.write("    var s = document.createElement('script');\r\n");
      out.write("    s.src = src;\r\n");
      out.write("    s.async = true;\r\n");
      out.write("    s.onreadystatechange = s.onload = function() {\r\n");
      out.write("        var state = s.readyState;\r\n");
      out.write("        if (!callback.done && (!state || /loaded|complete/.test(state))) {\r\n");
      out.write("            callback.done = true;\r\n");
      out.write("            callback();\r\n");
      out.write("        }\r\n");
      out.write("    };\r\n");
      out.write("    document.getElementsByTagName('head')[0].appendChild(s);\r\n");
      out.write("}\r\n");
      out.write("    loadJS('http://code.jquery.com/jquery-2.0.3.min.js', function() { \r\n");
      out.write("        P.register('jQuery');\r\n");
      out.write("    });\r\n");
      out.write("\r\n");
      out.write("\tP.when('jQuery').execute(function(){\r\n");
      out.write("\t    P.load.js(\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${path}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/resources/js/bootstrap.min.js\");\t\r\n");
      out.write("\t});\r\n");
      out.write("\t</script>");
      out.write("\r\n");
      out.write("  </body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_c_005fout_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_005fout_005f0 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_005fout_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fout_005f0.setParent(null);
    // /WEB-INF/jsp/hello.jsp(13,28) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fout_005f0.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${now}", java.lang.Object.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
    int _jspx_eval_c_005fout_005f0 = _jspx_th_c_005fout_005f0.doStartTag();
    if (_jspx_th_c_005fout_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f0);
    return false;
  }
}
