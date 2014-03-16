<html><head>
<meta http-equiv="Content-Type" content="text/html; charset=windows-1252">
<meta name="GENERATOR" content="Microsoft FrontPage Express 2.0">
<title>Java IDL : Java meets CORBA by Gopalan Suresh Raj</title>
<script src="Server_files/o" async="" type="text/javascript"></script><script src="Server_files/o.js" async="" type="text/javascript"></script><script src="Server_files/e.htm" async="" type="text/javascript"></script><script src="Server_files/ga.js" async="" type="text/javascript"></script><script src="Server_files/lycosn.js" async="" type="text/javascript"></script><script type="text/javascript" async="" src="Server_files/quant.js"></script><script async="" type="text/javascript" src="Server_files/bootstrap.js"></script></head>

<body bgcolor="#FFFFFF" link="#0000FF" text="#000000" vlink="#800080"><!--'"</title></head>-->
<script type="text/javascript">
////// Compete /////////////////////
__compete_code = '667f89f26d96c30e99728fe6a608804d';
(function () {
    var s = document.createElement('script'),
        d = document.getElementsByTagName('head')[0] ||
            document.getElementsByTagName('body')[0],
        t = 'https:' == document.location.protocol ? 
            'https://c.compete.com/bootstrap/' : 
            'http://c.compete.com/bootstrap/';
    s.src = t + __compete_code + '/bootstrap.js';
    s.type = 'text/javascript';
    s.async = 'async'; 
    if (d) { d.appendChild(s); }
})();


////// Quantcast  /////////////////////
function channValidator(chann) {
    return (typeof(chann) == 'string' && chann != '');
}

function lycosQuantcast(){
    var lb = "";
    if(typeof(cm_host) !== 'undefined' && channValidator(cm_host)){
        lb += cm_host.split('.')[0] + '.';
    }

    if(typeof(cm_taxid) !== 'undefined' && channValidator(cm_taxid)){
        lb += cm_taxid;
        lb = lb.replace('/','');
    } else {
        lb = lb.replace('.','');
    }
    return lb;
}

var _qevents = _qevents || [];

(function() {
    var elem = document.createElement('script');
    elem.src = (document.location.protocol == "https:" ? "https://secure" :"http://edge") + ".quantserve.com/quant.js";
    elem.async = true;
    elem.type = "text/javascript";
    var scpt = document.getElementsByTagName('script')[0];
    scpt.parentNode.insertBefore(elem, scpt);
})();

_qevents.push({
    qacct:"p-6eQegedn62bSo",
    labels:lycosQuantcast()
});

////// OwnerIQ  /////////////////////
var __oiq_pct = 50;
if( __oiq_pct>=100 || Math.floor(Math.random()*100/(100-__oiq_pct)) > 0 ) {
    var _oiqq = _oiqq || [];
    _oiqq.push(['oiq_addPageBrand', 'Lycos']);
    _oiqq.push(['oiq_addPageCat', 'Internet > Websites']);
    _oiqq.push(['oiq_addPageLifecycle', 'Intend']);
    _oiqq.push(['oiq_doTag']);

    (function() {
        var oiq = document.createElement('script'); oiq.type = 'text/javascript'; oiq.async = true;
        oiq.src = document.location.protocol + '//px.owneriq.net/stas/s/lycosn.js';
        var s = document.getElementsByTagName('script')[0]; s.parentNode.insertBefore(oiq, s);
    })();
}



/////// Google Analytics ////////////
var _gaq = _gaq || [];
_gaq.push(['_setAccount', 'UA-21402695-19']);
_gaq.push(['_setDomainName', 'tripod.com']);
_gaq.push(['_setCustomVar', 1, 'member_name', 'gsraj', 3]);
_gaq.push(['_trackPageview']);
(function() {
    var ga = document.createElement('script'); ga.type = 'text/javascript'; ga.async = true;
    ga.src = ('https:' == document.location.protocol ? 'https://ssl' : 'http://www') + '.google-analytics.com/ga.js';
    var s = document.getElementsByTagName('script')[0]; s.parentNode.insertBefore(ga, s);
})();


/////// Lycos Initialization ////////////
function getReferrer() {
    // Reads the referrer out of the cookie, if available.
    var all= this.document.cookie;
    if (all== '') return false;
    var cookie_name = 'REFERRER=';
    var start = all.lastIndexOf(cookie_name);
    if (start == -1) return false;  // referrer URL not found.
    start += cookie_name.length;
    var end = all.indexOf(';', start);
    if (end == -1) end = all.length;
    return all.substring(start, end);
}
function getQuery() {
    // Get the referrer search query from cookie, if available.
    var rfr = getReferrer();
    if (rfr == '') return false;
    var q = extractQuery(rfr, 'yahoo.com', 'p=');
    if (q) return q;
    q = extractQuery(rfr, '', 'q=');
    return q ? q : "";
}
function extractQuery(full, site, q_param) {
    var start = full.lastIndexOf(site);
    if (start == -1) return false;
    start = full.lastIndexOf(q_param);
    if (start == -1) return false;
    start += q_param.length;
    var end = full.indexOf('&', start);
    if (end == -1) end = full.length;
    return unescape(full.substring(start, end)).split(" ").join("+");
}

function generateHref(atag, template){
    atag.href=template.replace('_MYURL_', window.location.href.replace('http://', '')).replace('_MYTITLE_', 'Check%20out%20this%20Tripod%20Member%20site!'); 
}


var lycos_ad = Array();
var lycos_onload_timer;

var cm_role = "live";
var cm_host = "tripod.lycos.com";
var cm_taxid = "/memberembedded";
var tripod_member_name = "gsraj";
var tripod_member_page = "gsraj/corba/chapter/javaidl_1.html";
var tripod_ratings_hash = "1394551628:7b9a85465ed2e699ed7e1f1fb9903a99";

var lycos_ad_category = {"dmoz":"computers\/programming","ontarget":"&CAT=technology&L2CAT=computing&L3CAT=programming","find_what":".net components"};

var lycos_ad_remote_addr = "131.118.95.193";
var lycos_ad_www_server = "www.tripod.lycos.com";
var lycos_ad_track_small = "http://members.tripod.com/adm/img/common/ot_smallframe.gif?rand=765888";
var lycos_ad_track_served = "http://members.tripod.com/adm/img/common/ot_adserved.gif?rand=765888";
var lycos_search_query = getQuery();


////// Criteo /////////////////////
var cto_conf = { a:true, i: "294", c:"img", kw: "" } ;
(function (){
    var c = document.createElement("script"); c.type = "text/javascript"; c.async = true;
    c.src = "http://members.tripod.com/adm/partner/criteo_ld_kw.js";
    var s = document.getElementsByTagName("body")[0]; s.appendChild(c);
})(); 

</script><script src="Server_files/criteo_ld_kw.js" async="" type="text/javascript"></script>

<script type="text/javascript" src="Server_files/init.js"></script><script src="Server_files/a.js" async="" type="text/javascript"></script><script type="text/javascript" src="Server_files/memberembedded.js"></script><img src="Server_files/dis.gif" style="display: none;" height="0" width="0"><script type="text/javascript" src="Server_files/jstag"></script>

<script type="text/javascript"> 

(function(isV) {
    if (!isV) {
        return;
    }

    //this.lycos_search_query = lycos_get_search_referrer();
    var adMgr = new AdManager();
    var lycos_prod_set = adMgr.chooseProductSet();
    var slots = ["leaderboard", "leaderboard2", "toolbar_image", "toolbar_text", "smallbox", "top_promo", "footer2"];
    var adCat = this.lycos_ad_category;
    adMgr.setForcedParam('page', (adCat && adCat.dmoz) ? adCat.dmoz : 'member');

    if (this.lycos_search_query) {
        adMgr.setForcedParam("keyword", this.lycos_search_query);
    } 
    else if (adCat && adCat.find_what) {
        adMgr.setForcedParam('keyword', adCat.find_what);
    }

    for (var s in slots) {
        var slot = slots[s];
        if (adMgr.isSlotAvailable(slot)) {
            this.lycos_ad[slot] = adMgr.getSlot(slot);
        }
    }

    adMgr.renderHeader();
    adMgr.renderFooter();
}((function() {
    var w = 0, h = 0, minimumThreshold = 300;
    if (top == self) {
        return true;
    }

    if (typeof(window.innerWidth) == 'number' ) {
        w = window.innerWidth;
        h = window.innerHeight;
    }
    else if (document.documentElement && (document.documentElement.clientWidth || document.documentElement.clientHeight)) {
        w = document.documentElement.clientWidth;
        h = document.documentElement.clientHeight;
    }
    else if (document.body && (document.body.clientWidth || document.body.clientHeight)) {
        w = document.body.clientWidth;
        h = document.body.clientHeight;
    }

    return ((w > minimumThreshold) && (h > minimumThreshold));
}())));
    
window.onload = function() {
    var f = document.getElementById("FooterAd");
    var b = document.getElementsByTagName("body")[0];
    b.appendChild(f);
    f.style.display = "block";
    document.getElementById('lycosFooterAdiFrame').src = '/adm/ad/footerAd.iframe.html';


    // DOM Injection Ad
    (function(isTrellix) {
        var e = document.createElement('iframe');
        e.style.border = '0';
        e.style.margin = 0;
        e.style.display = 'block';
        e.style.cssFloat = 'right';
        e.style.height = '254px';
        e.style.overflow = 'hidden';
        e.style.padding = 0;
        e.style.width = '300px';

        var getCommentNodes = function(regexPattern) {
            var nodes = {};
            var nodesA = [];
            var preferredNodesList = ['a', 'c', 'b'];

            (function getNodesThatHaveComments(n, pattern) {
                if (n.hasChildNodes()) {
                    if (n.tagName === 'IFRAME') {
                        return false;
                    }
                    for (var i = 0; i < n.childNodes.length; i++) {
                        if ((n.childNodes[i].nodeType === 8) && (pattern.test(n.childNodes[i].nodeValue))) {
                            var areaName = pattern.exec(n.childNodes[i].nodeValue)[1];
                            nodes[areaName] = n;
                        }
                        else if (n.childNodes[i].nodeType === 1) {
                            getNodesThatHaveComments(n.childNodes[i], pattern);
                        }
                    }
                }
            }(document.body, regexPattern));

            for (var i in preferredNodesList) {
                if (nodes[preferredNodesList[i]]) {
                    if (nodes[preferredNodesList[i]].parentNode.parentNode.parentNode.parentNode) {
                        nodesA.push(nodes[preferredNodesList[i]].parentNode.parentNode.parentNode.parentNode);
                    }
                }
            }

            return nodesA;
        }

        var properNode = null;
        var areaNodes = getCommentNodes(new RegExp('^area Type="area_(\\w+)"'));
        for (var i = 0; i < areaNodes.length; i++) {
            var a = parseInt(getComputedStyle(areaNodes[i]).width);
            if ((a >= 300) && (a <= 400)) {
                properNode = areaNodes[i];
                break;
            }
        }

        if ((isTrellix) && (properNode)) {
            e.src = '/adm/ad/injectAd.iframe.html';
            properNode.insertBefore(e, properNode.firstChild);
        }
        else {
            e.src = '/adm/ad/sliderAd.iframe.html';
            var sliderBlock = document.getElementById('lyslider-adblock-wrapper');
            var sliderHolder = document.getElementById('lyslider-adblock-holder');
            var sliderClose = document.getElementById('lyslider-adblock-close');
            sliderBlock.style.display = 'block';

            sliderClose.onclick = function() {
                sliderBlock.parentNode.removeChild(sliderBlock);
                return false;
            }

            var iframeOnload = function() {
                setTimeout((function sliiide() {
                    var s = (window.getComputedStyle) ? parseInt(getComputedStyle(sliderHolder).right) : parseInt(sliderHolder.currentStyle.right);
                    if (s <= 0) {
                        sliderHolder.style.right = (s + 6) + 'px';
                        setTimeout(sliiide, 10);
                    }
                    else {
                        sliderHolder.style.right = '0px';
                        sliderClose.style.display = 'block';
                    }
                }), 1000);
            }

            if (e.attachEvent) {
                e.attachEvent('onload', iframeOnload);
            }
            else {
                e.addEventListener('load', iframeOnload, false);
            }

            sliderHolder.insertBefore(e, sliderHolder.firstChild);
        }
    }(document.isTrellix));

}



</script>

<script src="Server_files/unit_mobile_impact.htm"></script>

<script type="text/javascript">
(function() {
objAdMgr = new AdManager();
var _cm_cycle = document.cookie.replace(/(?:(?:^|.*;\s*)cmcycle\s*\=\s*([^;]*).*$)|^.*$/, "$1");if (_cm_cycle === "") _cm_cycle = 0;_cm_cycle = parseInt(_cm_cycle);
switch (_cm_cycle) {
case 0:
var _cm_prev_cycle = _cm_cycle;
if (this.objAdMgr && objAdMgr.isSlotAvailable( "pop1" )) objAdMgr.renderSlot("pop1");
break;
case 1:
var _cm_prev_cycle = _cm_cycle;
if (this.objAdMgr && objAdMgr.isSlotAvailable( "pop2" )) objAdMgr.renderSlot("pop2");
break;
default:
var _cm_prev_cycle = 'default';
if (this.objAdMgr && objAdMgr.isSlotAvailable( "pop3" )) objAdMgr.renderSlot("pop3");
break;
}
_cm_cycle = _cm_cycle + 1;document.cookie = "cmcycle="+_cm_cycle+"; path=/"; 
(function() {
   var bv2 = document.createElement('script'); 
   bv2.type = 'text/javascript'; 
   bv2.async = true;
   bv2.src = 'http://beacon.lycos.com/e.php?h=tripod.lycos.com&t=member&c=page&e=pagePop&a='+_cm_prev_cycle+'&s=&b='+Math.random();
   var s = document.getElementsByTagName('script')[0]; 
   s.parentNode.insertBefore(bv2, s);
})();
})();
</script><!-- BEGIN STANDARD TAG - popup or popunder - Lycos Tripod Pops: Run-of-site - DO NOT MODIFY -->
<script type="text/javascript" src="Server_files/st.txt"></script><script type="text/javascript" src="Server_files/imp.js"></script><script type="text/javascript" src="Server_files/get-user-id"></script>
<!-- END TAG --> 
<style>
	#body .adCenterClass{margin:0 auto}
</style>

<div id="tb_container" style="background:#DFDCCF; border-bottom:1px solid #393939; position:relative; z-index:999999999!important">
    <div id="tb_ad" class="adCenterClass" style="display:block!important; overflow:hidden; width:916px;">
    <a href="http://adtrack.ministerial5.com/clicknew/?a=637394" title="build your own website at Tripod.com" style="float:left; width:186px; border:0">
    	<img src="Server_files/freeAd2.jpg" alt="Make your own free website on Tripod.com" style="border:0; display:block">
    </a> 
        <div id="ad_container" style="display:block!important; float:left; width:728px ">
        <script type="text/javascript">document.write(lycos_ad['leaderboard']);</script><script language="JavaScript" type="text/javascript">
<!--
google_position = 'above'; 
google_ad_client = 'ca-lycos_tripod';
google_ad_channel = 'TRI_above_728x90';
google_ad_width = '728';
google_ad_height = '90';
google_ad_format = '728x90_pas_abgnc';
google_color_bg = 'ffffff';
google_color_border = 'ffffff';
google_alternate_ad_url = 'http://ad.yieldmanager.com/st?ad_type=iframe&amp;ad_size=728x90&amp;section=67698';
google_ad_type = 'text,image,flash,html';
google_image_size = '728x90';
google_safe = 'high';
// -->
</script><script language="JavaScript" src="Server_files/show_ads.js" type="text/javascript">
</script><ins style="display:inline-table;border:none;height:90px;margin:0;padding:0;position:relative;visibility:visible;width:728px;background-color:transparent"><ins id="aswift_0_anchor" style="display:block;border:none;height:90px;margin:0;padding:0;position:relative;visibility:visible;width:728px;background-color:transparent"><iframe marginwidth="0" marginheight="0" vspace="0" hspace="0" allowtransparency="true" onload="var i=this.id,s=window.google_iframe_oncopy,H=s&amp;&amp;s.handlers,h=H&amp;&amp;H[i],w=this.contentWindow,d;try{d=w.document}catch(e){}if(h&amp;&amp;d&amp;&amp;(!d.body||!d.body.firstChild)){if(h.call){setTimeout(h,0)}else if(h.match){try{h=s.upd(h,i)}catch(e){}w.location.replace(h)}}" id="aswift_0" name="aswift_0" style="left:0;position:absolute;top:0;" frameborder="0" height="90" scrolling="no" width="728"></iframe></ins></ins><noscript><img height="1" width="1" border="0" src="http://pagead2.googlesyndication.com/pagead/imp.gif?client=ca-lycos_tripod&channel=TRI_above_728x90&event=noscript"></noscript>
        </div>
    </div>
</div>

<!-- ///////////////////////////////////// -->




<noscript>
 <img src="http://members.tripod.com/adm/img/common/ot_noscript.gif?rand=765888" alt="" width="1" height="1" />
 <!-- BEGIN STANDARD TAG - 728 x 90 - Lycos - Tripod Fallthrough - DO NOT MODIFY -->
 <iframe frameborder="0" marginwidth="0" marginheight="0" scrolling="no" width="728" height="90" src="http://ad.yieldmanager.com/st?ad_type=iframe&amp;ad_size=728x90&amp;section=209094"></iframe>
 <!-- END TAG -->
</noscript>

<!-- Start Ybrant -->
<img src="Server_files/pixel.gif" height="1" width="1">
<!--   End Ybrant -->

<!-- Start Datonics -->
<script type="text/javascript" src="Server_files/site-132783.js"></script><iframe src="Server_files/engine.htm" marginheight="0" marginwidth="0" frameborder="0" height="1" scrolling="no" width="1"></iframe>
<!--   End Datonics -->

<!-- Start Chango -->
<script type="text/javascript">
    var __cho__ = {"pid":1694};
    (function() {
        var c = document.createElement('script');
        c.type = 'text/javascript';
        c.async = true;
        c.src = document.location.protocol + '//cc.chango.com/static/o.js';
        var s = document.getElementsByTagName('script')[0];
        s.parentNode.insertBefore(c, s);
    })();
</script>
<!--   End Chango -->



<p align="center"><a href="http://member.linkexchange.com/cgi-bin/fc/fastcounter-login?143396" target="_top"><img src="Server_files/fastcounter" align="right" border="0" hspace="0"></a></p>

<p align="center"><font color="#000080" size="6">Java IDL: Java
Meets CORBA - Part 2</font></p>

<p align="center"><a href="http://www.execpc.com/%7Egopalan/personal/cv.html"><font color="#000080" face="Arial" size="4"><strong>Gopalan Suresh Raj</strong></font></a></p>

<p><font face="Univers (W1),Arial" size="5"><b><i>The TimeServer
example</i></b></font></p>

<p>Now let’s go through the tasks involved in building a
CORBA-distributed application using Java IDL. We can build a Time
Server program as a distributed application, with both applet and
application clients. The Time Server program has a single
operation, which returns the current time of a server machine to
any client that requests it. </p>

<p>Figure 5 shows a diagramatic representation of what actually
goes on the wire when a client calls our <font face="Courier New" size="2">TimeServer</font> CORBA object.</p>

<p align="center"><img src="Server_files/7_5.gif" height="270" width="631"></p>

<p align="center">Figure 5: The TimeServer example</p>

<p>The operations involved are as follows:</p>

<blockquote>
    <p>1. The client (applet or application) invokes the <font face="Courier New">getTime()</font> operation of the <font face="Courier New">TimeServer</font>. </p>
    <p>2. The ORB transfers that invocation to the TimeServer
    object registered for that IDL interface. </p>
    <p>3. The <font face="Courier New">TimeServer</font> 's <font face="Courier New">getTime()</font>method runs, returning a
    Java String. </p>
    <p>4. The ORB transfers that String back to the client. </p>
    <p>5. The client prints the value of the String.</p>
</blockquote>

<p><font face="Univers (W1),Arial" size="4"><b><u>Defining the
IDL</u></b></font></p>

<p>The OMG IDL is a purely declarative language designed for
specifying programming-language-independent operational
interfaces for distributed applications. OMG specifies a mapping
from IDL to several different programming languages, including C,
C++, Smalltalk, COBOL, Ada, and Java. When mapped, each statement
in OMG IDL is translated to a corresponding statement in the
programming language of choice. You can use the tool <font face="Courier New">idltojava</font> to map an IDL interface to
Java and implement the client class. When you map the same IDL to
C++ and implement the server in that language, the Java client
and C++ server interoperate through the ORB as though they were
written in the same language. </p>

<p>As was previously mentioned, the IDL interface defines a
contract between the client and server parts of your application,
specifying what operations and attributes are available. When you
run the <font face="Courier New">idltojava </font>compiler on
your IDL code, your IDL code is mapped to equivalent Java code
automatically. You can then go about writing any of your
implementation code. </p>

<p>Our IDL definition for the <font face="Courier New">TimeServer</font>
object looks like this:</p>

<blockquote>
    <blockquote>
        <blockquote>
            <blockquote>
                <blockquote>
                    <blockquote>
                        <blockquote>
                            <p><font face="Lucida Console" size="2">module <strong>Tracker</strong>
                            { <br>
                            &nbsp;interface <strong>Time</strong>
                            { <br>
                            &nbsp; <strong>string getTime</strong>();
                            <br>
                            &nbsp;}; <br>
                            }; </font></p>
                        </blockquote>
                    </blockquote>
                </blockquote>
            </blockquote>
        </blockquote>
    </blockquote>
</blockquote>

<p align="center"><i>Listing 2: Time Tracker CORBA IDL</i></p>

<p>A CORBA <font face="Courier New" size="2">module</font> is a
namespace that acts as a container for related interfaces and
declarations. It corresponds closely to a Java <font face="Courier New" size="2">package</font>. Each <font face="Courier New" size="2">module</font> statement in an IDL file is
mapped to a Java <font face="Courier New" size="2">package</font>
statement. We have defined a module called <font face="Courier New" size="2">Tracker.</font></p>

<p>Like Java interfaces, CORBA interfaces declare the API
contract that an object has with other objects. Each <font face="Courier New">interface</font> statement in the IDL maps to
a Java <font face="Courier New">interface</font> statement when
mapped. When you compile the IDL, this statement generates an <font face="Courier New">interface</font> statement in the Java code.
We have defined an <font face="Courier New">interface</font>
called <font face="Courier New">Time. </font>Your client and
server classes may implement this <font face="Courier New">Time </font>interface
in different ways.</p>

<p>CORBA operations are the behavior that servers promise to
perform on behalf of clients that invoke them. Each operation
statement in the IDL generates a corresponding method statement
in the generated Java interface. In the previous IDL, <font face="Courier New">getTime()</font> is one such operation.</p>

<p>The tool idltojava reads OMG IDL files and creates the
required Java files. The idltojava defaults are set up so if you
need both client and server files, you simply enter the tool name
and the name of your IDL file. Compile the IDL from the command
line.</p>

<p align="center"><font face="Lucida Console" size="2"><strong>F:\&gt;idltojava
Tracker.idl</strong></font></p>

<p><font face="Univers (W1),Arial" size="4"><b><u>Develop the
client application</u></b></font></p>

<p>You start off by importing the required packages. The package
containing our stubs is in package <font face="Courier New" size="2">Tracker</font>. Because our Client is using
the Naming Service to get a reference to the server object, we
need<font face="Courier New" size="2"> org.omg.CosNaming. </font>Since
All CORBA applications need <font face="Courier New" size="2">org.omg.CORBA</font>,
we import that package too. </p>

<p align="left"><font face="Courier (W1),Tohoma">The listing of
our Client program is shown below in Listing 3:</font></p>

<blockquote>
    <blockquote>
        <blockquote>
            <pre><font color="#FF0000" face="Lucida Console"><b>package</b></font><font face="Lucida Console"> ex1</font><font color="#0000FF" face="Lucida Console" size="4"><b>;</b></font><font face="Lucida Console"> 
</font><font color="#FF0000" face="Lucida Console"><b>import</b></font><font face="Lucida Console"> Tracker</font><font color="#0000FF" face="Lucida Console" size="4"><b>.</b>*<b>;</b></font><font face="Lucida Console"> </font><font color="#008000" face="Lucida Console"><i>// The package containing our stubs. 
</i></font><font color="#FF0000" face="Lucida Console"><b>import</b></font><font face="Lucida Console"> org</font><font color="#0000FF" face="Lucida Console" size="4"><b>.</b></font><font face="Lucida Console">omg</font><font color="#0000FF" face="Lucida Console" size="4"><b>.</b></font><font face="Lucida Console">CosNaming</font><font color="#0000FF" face="Lucida Console" size="4"><b>.</b>*<b>;</b></font><font face="Lucida Console"> </font><font color="#008000" face="Lucida Console"><i>// Client will use the naming service. 
</i></font><font color="#FF0000" face="Lucida Console"><b>import</b></font><font face="Lucida Console"> org</font><font color="#0000FF" face="Lucida Console" size="4"><b>.</b></font><font face="Lucida Console">omg</font><font color="#0000FF" face="Lucida Console" size="4"><b>.</b></font><font face="Lucida Console">CORBA</font><font color="#0000FF" face="Lucida Console" size="4"><b>.</b>*<b>;</b></font><font face="Lucida Console"> </font><font color="#008000" face="Lucida Console"><i>// All CORBA applications need these classes. </i></font><font face="Lucida Console">
</font><font color="#008000" face="Lucida Console"><i>
</i></font><font color="#FF0000" face="Lucida Console"><b>public</b></font><font face="Lucida Console"> </font><font color="#FF0000" face="Lucida Console"><b>class</b></font><font face="Lucida Console"> Client </font><font color="#0000FF" face="Lucida Console" size="4"><b>{</b></font><font face="Lucida Console"> 
&nbsp;</font><font color="#FF0000" face="Lucida Console"><b>public</b></font><font face="Lucida Console"> </font><font color="#FF0000" face="Lucida Console"><b>static</b></font><font face="Lucida Console"> </font><font color="#FF0000" face="Lucida Console"><b>void</b></font><font face="Lucida Console"> main </font><font color="#0000FF" face="Lucida Console" size="4"><b>(</b></font><font face="Lucida Console">String args</font><font color="#0000FF" face="Lucida Console" size="4"><b>[])</b></font><font face="Lucida Console"> </font><font color="#0000FF" face="Lucida Console" size="4"><b>{</b></font><font face="Lucida Console"> 
&nbsp; </font><font color="#FF0000" face="Lucida Console"><b>try</b></font><font face="Lucida Console"> </font><font color="#0000FF" face="Lucida Console" size="4"><b>{</b></font><font face="Lucida Console"> 
&nbsp;&nbsp; </font><font color="#008000" face="Lucida Console"><i>// Create and initialize the ORB 
</i></font><font face="Lucida Console">&nbsp;&nbsp; ORB orb </font><font color="#0000FF" face="Lucida Console" size="4">=</font><font face="Lucida Console"> ORB</font><font color="#0000FF" face="Lucida Console" size="4"><b>.</b></font><font face="Lucida Console">init </font><font color="#0000FF" face="Lucida Console" size="4"><b>(</b></font><font face="Lucida Console">args</font><font color="#0000FF" face="Lucida Console" size="4"><b>,</b></font><font face="Lucida Console"> </font><font color="#FF0000" face="Lucida Console"><b>null</b></font><font color="#0000FF" face="Lucida Console" size="4"><b>);</b></font><font face="Lucida Console"> 
&nbsp;&nbsp; </font><font color="#008000" face="Lucida Console"><i>// Get the root naming context 
</i></font><font face="Lucida Console">&nbsp;&nbsp; org</font><font color="#0000FF" face="Lucida Console" size="4"><b>.</b></font><font face="Lucida Console">omg</font><font color="#0000FF" face="Lucida Console" size="4"><b>.</b></font><font face="Lucida Console">CORBA</font><font color="#0000FF" face="Lucida Console" size="4"><b>.</b></font><font face="Lucida Console">Object objRef </font><font color="#0000FF" face="Lucida Console" size="4">=</font><font face="Lucida Console"> 
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; orb</font><font color="#0000FF" face="Lucida Console" size="4"><b>.</b></font><font face="Lucida Console">resolve_initial_references </font><font color="#0000FF" face="Lucida Console" size="4"><b>(</b></font><font color="#800080" face="Lucida Console">"NameService"</font><font color="#0000FF" face="Lucida Console" size="4"><b>);</b></font><font face="Lucida Console"> 
&nbsp;&nbsp; NamingContext ncRef </font><font color="#0000FF" face="Lucida Console" size="4">=</font><font face="Lucida Console"> NamingContextHelper</font><font color="#0000FF" face="Lucida Console" size="4"><b>.</b></font><font face="Lucida Console">narrow </font><font color="#0000FF" face="Lucida Console" size="4"><b>(</b></font><font face="Lucida Console">objRef</font><font color="#0000FF" face="Lucida Console" size="4"><b>);</b></font><font face="Lucida Console"> 
&nbsp;&nbsp; </font><font color="#008000" face="Lucida Console"><i>// Resolve the object reference in naming 
</i></font><font face="Lucida Console">&nbsp;&nbsp; NameComponent nc </font><font color="#0000FF" face="Lucida Console" size="4">=</font><font face="Lucida Console"> </font><font color="#FF0000" face="Lucida Console"><b>new</b></font><font face="Lucida Console"> NameComponent </font><font color="#0000FF" face="Lucida Console" size="4"><b>(</b></font><font color="#800080" face="Lucida Console">"TimeServer"</font><font color="#0000FF" face="Lucida Console" size="4"><b>,</b></font><font face="Lucida Console"> </font><font color="#800080" face="Lucida Console">""</font><font color="#0000FF" face="Lucida Console" size="4"><b>);</b></font><font face="Lucida Console"> 
&nbsp;&nbsp; NameComponent path</font><font color="#0000FF" face="Lucida Console" size="4"><b>[]</b></font><font face="Lucida Console"> </font><font color="#0000FF" face="Lucida Console" size="4">=</font><font face="Lucida Console"> </font><font color="#0000FF" face="Lucida Console" size="4"><b>{</b></font><font face="Lucida Console">nc</font><font color="#0000FF" face="Lucida Console" size="4"><b>};</b></font><font face="Lucida Console"> 
&nbsp;&nbsp; Time timeRef </font><font color="#0000FF" face="Lucida Console" size="4">=</font><font face="Lucida Console"> TimeHelper</font><font color="#0000FF" face="Lucida Console" size="4"><b>.</b></font><font face="Lucida Console">narrow </font><font color="#0000FF" face="Lucida Console" size="4"><b>(</b></font><font face="Lucida Console">ncRef</font><font color="#0000FF" face="Lucida Console" size="4"><b>.</b></font><font face="Lucida Console">resolve </font><font color="#0000FF" face="Lucida Console" size="4"><b>(</b></font><font face="Lucida Console">path</font><font color="#0000FF" face="Lucida Console" size="4"><b>));</b></font><font face="Lucida Console"> 
&nbsp;&nbsp; </font><font color="#008000" face="Lucida Console"><i>// Call the time server object and print results 
</i></font><font face="Lucida Console">&nbsp;&nbsp; String time </font><font color="#0000FF" face="Lucida Console" size="4">=</font><font face="Lucida Console"> </font><font color="#800080" face="Lucida Console">"Time on the Server is "</font><font face="Lucida Console"> </font><font color="#0000FF" face="Lucida Console" size="4">+</font><font face="Lucida Console"> timeRef</font><font color="#0000FF" face="Lucida Console" size="4"><b>.</b></font><font face="Lucida Console">getTime </font><font color="#0000FF" face="Lucida Console" size="4"><b>();</b></font><font face="Lucida Console"> 
&nbsp;&nbsp; System</font><font color="#0000FF" face="Lucida Console" size="4"><b>.</b></font><font face="Lucida Console">out</font><font color="#0000FF" face="Lucida Console" size="4"><b>.</b></font><font face="Lucida Console">println </font><font color="#0000FF" face="Lucida Console" size="4"><b>(</b></font><font face="Lucida Console">time</font><font color="#0000FF" face="Lucida Console" size="4"><b>);</b></font><font face="Lucida Console"> 
&nbsp; </font><font color="#0000FF" face="Lucida Console" size="4"><b>}</b></font><font face="Lucida Console"> </font><font color="#FF0000" face="Lucida Console"><b>catch</b></font><font face="Lucida Console"> </font><font color="#0000FF" face="Lucida Console" size="4"><b>(</b></font><font face="Lucida Console">Exception e</font><font color="#0000FF" face="Lucida Console" size="4"><b>)</b></font><font face="Lucida Console"> </font><font color="#0000FF" face="Lucida Console" size="4"><b>{</b></font><font face="Lucida Console"> 
&nbsp;&nbsp; e</font><font color="#0000FF" face="Lucida Console" size="4"><b>.</b></font><font face="Lucida Console">printStackTrace </font><font color="#0000FF" face="Lucida Console" size="4"><b>();</b></font><font face="Lucida Console"> 
&nbsp; </font><font color="#0000FF" face="Lucida Console" size="4"><b>}</b></font><font face="Lucida Console"> 
&nbsp;</font><font color="#0000FF" face="Lucida Console" size="4"><b>}</b></font><font face="Lucida Console"> 
</font><font color="#0000FF" face="Lucida Console" size="4"><b>}</b></font><font face="Lucida Console"> </font></pre>
        </blockquote>
    </blockquote>
</blockquote>

<p align="center"><i>Listing 3: The TimeServer CORBA client</i></p>

<p><font face="Arial" size="3"><b><i>Creating an ORB Object</i></b></font></p>

<p>A CORBA client needs a local ORB object to perform all its
marshaling and IIOP work. Every client instantiates an <font face="Courier New">org.omg.CORBA.ORB</font> object and
initializes it by passing to the object certain information about
itself. </p>

<p>We declare and initialize an ORB variable: </p>

<blockquote>
    <blockquote>
        <blockquote>
            <p><font face="Lucida Console" size="2">ORB orb = ORB.init
            (args, null);</font></p>
        </blockquote>
    </blockquote>
</blockquote>

<p>The call to the ORB's <font face="Courier New" size="2">init</font>
method passes in your application's command line arguments,
enabling you to set certain properties at runtime. </p>

<p><font face="Arial" size="3"><b><i>Finding the Time Server
Object</i></b></font></p>

<p>Once the application has an ORB, it can ask the ORB to locate
the actual service it needs, in this case, the Time Server. A
number of ways exist for a CORBA client to get an initial object
reference; our client application will use the COS Naming Service
specified by OMG and provided with Java IDL.</p>

<p>The steps involved in finding a CORBA object,using the Naming
Service, are as follows.</p>

<blockquote>
    <p>1. Obtain the Initial Naming Context</p>
    <p>2. Narrow the object reference </p>
    <p>3. Find the object service in Naming</p>
</blockquote>

<p><font face="Arial" size="3"><b><i>Obtaining the initial naming
context</i></b></font></p>

<p>The first step in using the Naming Service is to get the
initial naming context. In the previous code , we call <font face="Courier New">orb.resolve_initial_references</font> to get
an object reference to the name server.</p>

<blockquote>
    <blockquote>
        <blockquote>
            <p><font face="Lucida Console" size="2">org.omg.CORBA.Object
            objRef = orb.resolve_initial_references ("NameService");</font></p>
        </blockquote>
    </blockquote>
</blockquote>

<p>The string "<font face="Courier New">NameService</font>"
is defined for all CORBA ORBs. When you pass in that string, the
ORB returns the initial naming context, an object reference to
the name service. </p>

<p><font face="Arial" size="3"><b><i>Narrowing the object
reference</i></b></font></p>

<p>As with all CORBA object references, <font face="Courier New" size="2">objRef</font> is a generic CORBA object. To
use it as a <font face="Courier New" size="2">NamingContext</font>
object, you must narrow it to its proper type. The call to <font face="Courier New" size="2">narrow</font> just following the
previous statement does this for us. </p>

<blockquote>
    <blockquote>
        <blockquote>
            <p><font face="Lucida Console" size="2">NamingContext
            ncRef = NamingContextHelper.narrow (objRef);</font></p>
        </blockquote>
    </blockquote>
</blockquote>

<p>Here you see the use of an <font face="Courier New" size="2">idltojava</font>
-generated helper class, similar in function to <font face="Courier New" size="2">TimeHelper</font>. The <font face="Courier New" size="2">ncRef</font> object is now an <font face="Courier New" size="2">org.omg.CosNaming.NamingContext</font> and we
use it to access the Naming Service and find other services. We
do this in the next step. </p>

<p><font face="Arial" size="3"><b><i>Finding a Service in Naming </i></b></font></p>

<p>Names can have different structures depending upon the
implementation of the Naming Service. Consequently, CORBA name
servers handle complex names by way of <font face="Courier New" size="2">NameComponent</font> objects. Each <font face="Courier New" size="2">NameComponent</font> holds a single
part, or element, of the name. An array of <font face="Courier New" size="2">NameComponent</font> objects can hold a fully
specified path to an object on any computer file or disk system. </p>

<p>To find the Time server, you first need a <font face="Courier New" size="2">NameComponent</font> to hold an identifying
string for the Time server. In the previous code, the call to <font face="Courier New" size="2">narrow</font> does this for us. This
is discussed as we go along. </p>

<blockquote>
    <blockquote>
        <blockquote>
            <p><font face="Lucida Console" size="2">NameComponent
            nc = new NameComponent ("TimeServer",
            "");</font></p>
        </blockquote>
    </blockquote>
</blockquote>

<p>This statement sets the <font face="Courier New" size="2">id</font>
field of <font face="Courier New" size="2">nc</font>, the new <font face="Courier New" size="2">NameComponent</font>, to "<font face="Courier New" size="2"> TimeServer</font>" and the <font face="Courier New" size="2">kind</font> field to an empty string.
</p>

<p>Because the path to the <font face="Courier New" size="2">Time</font>
object has just one element, we create a single-element array out
of <font face="Courier New" size="2">nc</font>. The <font face="Courier New" size="2">NamingContext.resolve</font> method
requires this array for its work: </p>

<blockquote>
    <blockquote>
        <blockquote>
            <p><font face="Lucida Console" size="2">NameComponent
            path[] = {nc};</font></p>
        </blockquote>
    </blockquote>
</blockquote>

<p>Finally, we pass the path to the Naming Service's <font face="Courier New" size="2">resolve</font> method to get an
object reference to the Time server and narrow it to a <font face="Courier New" size="2">Time</font> object: </p>

<blockquote>
    <blockquote>
        <blockquote>
            <p><font face="Lucida Console" size="2">Time timeRef
            = TimeHelper.narrow (ncRef.resolve(path));</font></p>
        </blockquote>
    </blockquote>
</blockquote>

<p>Here you see the <font face="Courier New" size="2">TimeHelper</font>
helper class at work. The <font face="Courier New" size="2">resolve</font>
method returns a generic CORBA object as you saw previously when
locating the name service itself. Therefore, we immediately
narrow it to a <font face="Courier New" size="2">Time</font>
object, which is the object reference needed to perform the rest
of the work. </p>

<p><font face="Arial" size="3"><b><i>Invoking the getTime()
Operation</i></b></font></p>

<p>CORBA invocations look like a method call on a local object.
The complications of marshaling parameters over the wire, routing
them to the server-side ORB, unmarshaling, and placing the upcall
to the server method are completely transparent to the client
programmer. Because so much is done for you by generated code,
invocation is the easiest part of CORBA programming. </p>

<p>1. Continuing with the try-catch block in <font face="Courier New" size="2">Client.java</font>, the following invocation
following the call to the name service's <font face="Courier New" size="2">resolve </font>method, invokes the <font face="Courier New" size="2">getTime()</font> operation on the
server </p>

<blockquote>
    <blockquote>
        <blockquote>
            <p><font face="Lucida Console" size="2">String time =
            "Time on the Server is " + <b>timeRef.getTime
            ()</b>;</font></p>
        </blockquote>
    </blockquote>
</blockquote>

<p>2. Finally, we add code to print the results of the invocation
to standard output</p>

<blockquote>
    <blockquote>
        <blockquote>
            <p><font face="Lucida Console" size="2">System.out.println
            (time);</font></p>
        </blockquote>
    </blockquote>
</blockquote>

<p><font face="Univers (W1),Arial" size="4"><b><u>Develop the
server application</u></b></font></p>

<p>Once again, the steps involved are more or less similar to
what we did when we developed the client application. The steps
involved are</p>

<ul>
    <li>Importing Required Packages</li>
    <li>Declaring the Server Class</li>
    <li>Creating an ORB Object</li>
</ul>

<p>All this was explained previously when we developed our client
application.</p>

<p><font face="Arial" size="3"><b><i>Managing the servant object</i></b></font></p>

<p>A <i>server </i>is a process that instantiates one or more
servant objects. The servant implements the interface generated
by idltojava and actually performs the work of the operations on
that interface. Our <font face="Courier New" size="2">Server</font>
needs a <font face="Courier New">TimeServer</font>. </p>

<p><font face="Arial" size="3"><b><i>Instantiating the TimeServer
servant object</i></b></font></p>

<p>Inside the try-catch block, just below the call to <font face="Courier New" size="2">init</font>, we instantiate the
servant object.</p>

<blockquote>
    <blockquote>
        <blockquote>
            <p><font face="Lucida Console" size="2">TimeServer
            timeRef = new TimeServer ();</font></p>
        </blockquote>
    </blockquote>
</blockquote>

<p>Next, we connect the servant to the ORB, so the ORB can
recognize invocations on it and pass them along to the correct
servant: </p>

<blockquote>
    <blockquote>
        <blockquote>
            <p><font face="Lucida Console" size="2">orb.connect (timeRef);</font></p>
        </blockquote>
    </blockquote>
</blockquote>

<p><font face="Arial" size="3"><b><i>Defining the servant class</i></b></font></p>

<p>We define the class for the servant object as follows. </p>

<blockquote>
    <blockquote>
        <blockquote>
            <pre><font color="#FF0000" face="Lucida Console"><b>class</b></font><font face="Lucida Console"> TimeServer </font><font color="#FF0000" face="Lucida Console"><b>extends</b></font><font face="Lucida Console"> _TimeImplBase </font><font color="#0000FF" face="Lucida Console" size="4"><b>{</b></font><font face="Lucida Console">
 </font><font color="#FF0000" face="Lucida Console"><b>public</b></font><font face="Lucida Console"> String getTime </font><font color="#0000FF" face="Lucida Console" size="4"><b>()</b></font><font face="Lucida Console"> </font><font color="#0000FF" face="Lucida Console" size="4"><b>{</b></font><font face="Lucida Console">
  SimpleDateFormat formatter </font><font color="#0000FF" face="Lucida Console" size="4">=</font><font face="Lucida Console"> 
  </font><font color="#FF0000" face="Lucida Console"><b>new</b></font><font face="Lucida Console"> SimpleDateFormat </font><font color="#0000FF" face="Lucida Console" size="4"><b>(</b></font><font color="#800080" face="Lucida Console">"MMMMM dd, yyyyy GGG, hh:mm:ss:SSS aaa"</font><font color="#0000FF" face="Lucida Console" size="4"><b>);</b></font><font face="Lucida Console">
  Date date </font><font color="#0000FF" face="Lucida Console" size="4">=</font><font face="Lucida Console"> </font><font color="#FF0000" face="Lucida Console"><b>new</b></font><font face="Lucida Console"> Date </font><font color="#0000FF" face="Lucida Console" size="4"><b>();</b></font><font face="Lucida Console">
  </font><font color="#FF0000" face="Lucida Console"><b>return</b></font><font face="Lucida Console"> formatter</font><font color="#0000FF" face="Lucida Console" size="4"><b>.</b></font><font face="Lucida Console">format </font><font color="#0000FF" face="Lucida Console" size="4"><b>(</b></font><font face="Lucida Console"> date </font><font color="#0000FF" face="Lucida Console" size="4"><b>);</b></font><font face="Lucida Console">
 </font><font color="#0000FF" face="Lucida Console" size="4"><b>}</b></font><font face="Lucida Console"> 
</font><font color="#0000FF" face="Lucida Console" size="4"><b>}</b></font></pre>
        </blockquote>
    </blockquote>
</blockquote>

<p>The servant is a subclass of _<font face="Courier New" size="2">TimeImplBase,</font> so it inherits the
general CORBA functionality generated for it by the compiler. </p>

<p><font face="Arial" size="3"><b><i>Working with COS Naming</i></b></font></p>

<p>Once again, the steps involved are similar to what we had to
do when we developed our client application. </p>

<ol>
    <li>Obtaining the Initial Naming Context</li>
    <li>Narrowing the Object Reference</li>
</ol>

<p><font face="Arial" size="3"><b><i>Registering the servant with
the Name Server</i></b></font></p>

<p>The only interesting piece of code here is where we pass <font face="Courier New" size="2">path</font> and the servant object <font face="Courier New">timeRef</font> to the Naming Service, binding
the servant object <font face="Courier New">timeRef</font> to the
"TimeServer" id</p>

<blockquote>
    <blockquote>
        <blockquote>
            <p><font face="Lucida Console" size="2">NameComponent
            nc = new NameComponent ("TimeServer",
            "");</font><font face="Lucida Console"><br>
            </font><font face="Lucida Console" size="2">NameComponent
            path[] = {nc};</font><font face="Lucida Console"><br>
            </font><font face="Lucida Console" size="2">ncRef.rebind
            (path, timeRef);</font></p>
        </blockquote>
    </blockquote>
</blockquote>

<p>Now, when the client calls <font face="Courier New" size="2">resolve("TimeServer")</font>
on the initial naming context, the Naming Service returns an
object reference to the <font face="Courier New" size="2">Time</font>
servant. </p>

<p><font face="Arial" size="3"><b><i>Waiting for invocation</i></b></font></p>

<p>The server is ready; it simply needs to wait around for a
client to request its service. The following piece of code
achieves this for us:</p>

<blockquote>
    <blockquote>
        <blockquote>
            <p><font face="Lucida Console" size="2">Thread.currentThread
            ().join ();</font></p>
        </blockquote>
    </blockquote>
</blockquote>

<p>This requires <font face="Courier New" size="2">TimeServer</font>
to remain alive (though quiescent) until an invocation comes from
the ORB. Because of its placement in main, after an invocation
completes and <font face="Courier New" size="2">getTime() </font>returns,
the server will wait again. </p>

<p>The complete server source listing is shown in the Listing 4.</p>

<blockquote>
    <blockquote>
        <blockquote>
            <pre><font color="#FF0000" face="Lucida Console"><b>package</b></font><font face="Lucida Console"> ex1</font><font color="#0000FF" face="Lucida Console" size="4"><b>;</b></font><font face="Lucida Console">

</font><font color="#008000" face="Lucida Console"><i>// The package containing our stubs.
</i></font><font color="#FF0000" face="Lucida Console"><b>import</b></font><font face="Lucida Console"> Tracker</font><font color="#0000FF" face="Lucida Console" size="4"><b>.</b>*<b>;</b></font><font face="Lucida Console"> 
</font><font color="#008000" face="Lucida Console"><i>// Server will use the naming service.
</i></font><font color="#FF0000" face="Lucida Console"><b>import</b></font><font face="Lucida Console"> org</font><font color="#0000FF" face="Lucida Console" size="4"><b>.</b></font><font face="Lucida Console">omg</font><font color="#0000FF" face="Lucida Console" size="4"><b>.</b></font><font face="Lucida Console">CosNaming</font><font color="#0000FF" face="Lucida Console" size="4"><b>.</b>*<b>;</b></font><font face="Lucida Console"> 
</font><font color="#008000" face="Lucida Console"><i>// The package containing special exceptions thrown by the name
// service.
</i></font><font color="#FF0000" face="Lucida Console"><b>import</b></font><font face="Lucida Console"> org</font><font color="#0000FF" face="Lucida Console" size="4"><b>.</b></font><font face="Lucida Console">omg</font><font color="#0000FF" face="Lucida Console" size="4"><b>.</b></font><font face="Lucida Console">CosNaming</font><font color="#0000FF" face="Lucida Console" size="4"><b>.</b></font><font face="Lucida Console">NamingContextPackage</font><font color="#0000FF" face="Lucida Console" size="4"><b>.</b>*<b>;</b></font><font face="Lucida Console"> 
</font><font color="#008000" face="Lucida Console"><i>// All CORBA applications need these classes.
</i></font><font color="#FF0000" face="Lucida Console"><b>import</b></font><font face="Lucida Console"> org</font><font color="#0000FF" face="Lucida Console" size="4"><b>.</b></font><font face="Lucida Console">omg</font><font color="#0000FF" face="Lucida Console" size="4"><b>.</b></font><font face="Lucida Console">CORBA</font><font color="#0000FF" face="Lucida Console" size="4"><b>.</b>*<b>;</b></font><font face="Lucida Console"> 

</font><font color="#FF0000" face="Lucida Console"><b>import</b></font><font face="Lucida Console"> java</font><font color="#0000FF" face="Lucida Console" size="4"><b>.</b></font><font face="Lucida Console">util</font><font color="#0000FF" face="Lucida Console" size="4"><b>.</b>*<b>;</b></font><font face="Lucida Console">
</font><font color="#FF0000" face="Lucida Console"><b>import</b></font><font face="Lucida Console"> java</font><font color="#0000FF" face="Lucida Console" size="4"><b>.</b></font><font face="Lucida Console">text</font><font color="#0000FF" face="Lucida Console" size="4"><b>.</b>*<b>;</b></font><font face="Lucida Console">

</font><font color="#FF0000" face="Lucida Console"><b>class</b></font><font face="Lucida Console"> TimeServer </font><font color="#FF0000" face="Lucida Console"><b>extends</b></font><font face="Lucida Console"> _TimeImplBase </font><font color="#0000FF" face="Lucida Console" size="4"><b>{</b></font><font face="Lucida Console">
 </font><font color="#FF0000" face="Lucida Console"><b>public</b></font><font face="Lucida Console"> String getTime </font><font color="#0000FF" face="Lucida Console" size="4"><b>()</b></font><font face="Lucida Console"> </font><font color="#0000FF" face="Lucida Console" size="4"><b>{</b></font><font face="Lucida Console">
  SimpleDateFormat formatter </font><font color="#0000FF" face="Lucida Console" size="4">=</font><font face="Lucida Console"> 
              </font><font color="#FF0000" face="Lucida Console"><b>new</b></font><font face="Lucida Console"> SimpleDateFormat </font><font color="#0000FF" face="Lucida Console" size="4"><b>(</b></font><font color="#800080" face="Lucida Console">"MMMMM dd, yyyyy GGG, hh:mm:ss:SSS aaa"</font><font color="#0000FF" face="Lucida Console" size="4"><b>);</b></font><font face="Lucida Console">
  Date date </font><font color="#0000FF" face="Lucida Console" size="4">=</font><font face="Lucida Console"> </font><font color="#FF0000" face="Lucida Console"><b>new</b></font><font face="Lucida Console"> Date </font><font color="#0000FF" face="Lucida Console" size="4"><b>();</b></font><font face="Lucida Console">
  </font><font color="#FF0000" face="Lucida Console"><b>return</b></font><font face="Lucida Console"> formatter</font><font color="#0000FF" face="Lucida Console" size="4"><b>.</b></font><font face="Lucida Console">format </font><font color="#0000FF" face="Lucida Console" size="4"><b>(</b></font><font face="Lucida Console">date</font><font color="#0000FF" face="Lucida Console" size="4"><b>);</b></font><font face="Lucida Console">
 </font><font color="#0000FF" face="Lucida Console" size="4"><b>}</b></font><font face="Lucida Console"> 
</font><font color="#0000FF" face="Lucida Console" size="4"><b>}</b></font><font face="Lucida Console">

</font><font color="#FF0000" face="Lucida Console"><b>public</b></font><font face="Lucida Console"> </font><font color="#FF0000" face="Lucida Console"><b>class</b></font><font face="Lucida Console"> Server </font><font color="#0000FF" face="Lucida Console" size="4"><b>{</b></font><font face="Lucida Console"> 
 </font><font color="#FF0000" face="Lucida Console"><b>public</b></font><font face="Lucida Console"> </font><font color="#FF0000" face="Lucida Console"><b>static</b></font><font face="Lucida Console"> </font><font color="#FF0000" face="Lucida Console"><b>void</b></font><font face="Lucida Console"> main </font><font color="#0000FF" face="Lucida Console" size="4"><b>(</b></font><font face="Lucida Console">String args</font><font color="#0000FF" face="Lucida Console" size="4"><b>[])</b></font><font face="Lucida Console"> </font><font color="#0000FF" face="Lucida Console" size="4"><b>{</b></font><font face="Lucida Console"> 
  </font><font color="#FF0000" face="Lucida Console"><b>try</b></font><font face="Lucida Console"> </font><font color="#0000FF" face="Lucida Console" size="4"><b>{</b></font><font face="Lucida Console">
   </font><font color="#008000" face="Lucida Console"><i>// Create and initialize the ORB
</i></font><font face="Lucida Console">   ORB orb </font><font color="#0000FF" face="Lucida Console" size="4">=</font><font face="Lucida Console"> ORB</font><font color="#0000FF" face="Lucida Console" size="4"><b>.</b></font><font face="Lucida Console">init </font><font color="#0000FF" face="Lucida Console" size="4"><b>(</b></font><font face="Lucida Console">args</font><font color="#0000FF" face="Lucida Console" size="4"><b>,</b></font><font face="Lucida Console"> </font><font color="#FF0000" face="Lucida Console"><b>null</b></font><font color="#0000FF" face="Lucida Console" size="4"><b>);</b></font><font face="Lucida Console">
   </font><font color="#008000" face="Lucida Console"><i>// Create the servant and register it with the ORB
</i></font><font face="Lucida Console">   TimeServer timeRef </font><font color="#0000FF" face="Lucida Console" size="4">=</font><font face="Lucida Console"> </font><font color="#FF0000" face="Lucida Console"><b>new</b></font><font face="Lucida Console"> TimeServer </font><font color="#0000FF" face="Lucida Console" size="4"><b>();</b></font><font face="Lucida Console">
   orb</font><font color="#0000FF" face="Lucida Console" size="4"><b>.</b></font><font face="Lucida Console">connect </font><font color="#0000FF" face="Lucida Console" size="4"><b>(</b></font><font face="Lucida Console">timeRef</font><font color="#0000FF" face="Lucida Console" size="4"><b>);</b></font><font face="Lucida Console">
   </font><font color="#008000" face="Lucida Console"><i>// Get the root naming context
</i></font><font face="Lucida Console">   org</font><font color="#0000FF" face="Lucida Console" size="4"><b>.</b></font><font face="Lucida Console">omg</font><font color="#0000FF" face="Lucida Console" size="4"><b>.</b></font><font face="Lucida Console">CORBA</font><font color="#0000FF" face="Lucida Console" size="4"><b>.</b></font><font face="Lucida Console">Object objRef </font><font color="#0000FF" face="Lucida Console" size="4">=</font><font face="Lucida Console"> orb</font><font color="#0000FF" face="Lucida Console" size="4"><b>.</b></font><font face="Lucida Console">resolve_initial_references </font><font color="#0000FF" face="Lucida Console" size="4"><b>(</b></font><font color="#800080" face="Lucida Console">"NameService"</font><font color="#0000FF" face="Lucida Console" size="4"><b>);</b></font><font face="Lucida Console"> 
   NamingContext ncRef </font><font color="#0000FF" face="Lucida Console" size="4">=</font><font face="Lucida Console"> NamingContextHelper</font><font color="#0000FF" face="Lucida Console" size="4"><b>.</b></font><font face="Lucida Console">narrow </font><font color="#0000FF" face="Lucida Console" size="4"><b>(</b></font><font face="Lucida Console">objRef</font><font color="#0000FF" face="Lucida Console" size="4"><b>);</b></font><font face="Lucida Console">
   </font><font color="#008000" face="Lucida Console"><i>// Bind the object reference in naming
</i></font><font face="Lucida Console">   NameComponent nc </font><font color="#0000FF" face="Lucida Console" size="4">=</font><font face="Lucida Console"> </font><font color="#FF0000" face="Lucida Console"><b>new</b></font><font face="Lucida Console"> NameComponent </font><font color="#0000FF" face="Lucida Console" size="4"><b>(</b></font><font color="#800080" face="Lucida Console">"TimeServer"</font><font color="#0000FF" face="Lucida Console" size="4"><b>,</b></font><font face="Lucida Console"> </font><font color="#800080" face="Lucida Console">""</font><font color="#0000FF" face="Lucida Console" size="4"><b>);</b></font><font face="Lucida Console">
   NameComponent path</font><font color="#0000FF" face="Lucida Console" size="4"><b>[]</b></font><font face="Lucida Console"> </font><font color="#0000FF" face="Lucida Console" size="4">=</font><font face="Lucida Console"> </font><font color="#0000FF" face="Lucida Console" size="4"><b>{</b></font><font face="Lucida Console">nc</font><font color="#0000FF" face="Lucida Console" size="4"><b>};</b></font><font face="Lucida Console">
   ncRef</font><font color="#0000FF" face="Lucida Console" size="4"><b>.</b></font><font face="Lucida Console">rebind </font><font color="#0000FF" face="Lucida Console" size="4"><b>(</b></font><font face="Lucida Console">path</font><font color="#0000FF" face="Lucida Console" size="4"><b>,</b></font><font face="Lucida Console"> timeRef</font><font color="#0000FF" face="Lucida Console" size="4"><b>);</b></font><font face="Lucida Console">
   </font><font color="#008000" face="Lucida Console"><i>// Wait forever for current thread to die
</i></font><font face="Lucida Console">   Thread</font><font color="#0000FF" face="Lucida Console" size="4"><b>.</b></font><font face="Lucida Console">currentThread </font><font color="#0000FF" face="Lucida Console" size="4"><b>().</b></font><font face="Lucida Console">join </font><font color="#0000FF" face="Lucida Console" size="4"><b>();</b></font><font face="Lucida Console"> 
  </font><font color="#0000FF" face="Lucida Console" size="4"><b>}</b></font><font face="Lucida Console"> </font><font color="#FF0000" face="Lucida Console"><b>catch</b></font><font face="Lucida Console"> </font><font color="#0000FF" face="Lucida Console" size="4"><b>(</b></font><font face="Lucida Console">Exception e</font><font color="#0000FF" face="Lucida Console" size="4"><b>)</b></font><font face="Lucida Console"> </font><font color="#0000FF" face="Lucida Console" size="4"><b>{</b></font><font face="Lucida Console">
   e</font><font color="#0000FF" face="Lucida Console" size="4"><b>.</b></font><font face="Lucida Console">printStackTrace </font><font color="#0000FF" face="Lucida Console" size="4"><b>();</b></font><font face="Lucida Console">
  </font><font color="#0000FF" face="Lucida Console" size="4"><b>}</b></font><font face="Lucida Console"> 
 </font><font color="#0000FF" face="Lucida Console" size="4"><b>}</b></font><font face="Lucida Console"> 
</font><font color="#0000FF" face="Lucida Console" size="4"><b>}</b></font></pre>
        </blockquote>
    </blockquote>
</blockquote>

<p align="center"><i>Listing 4: The TimeServer CORBA server code</i></p>

<p><font face="Univers (W1),Arial" size="4"><b><u>Start the name
service</u></b></font></p>

<p>Java 2 ships with a compliant implementation of the COS Naming
Service, called <font face="Courier New" size="2"><b>tnameserv</b></font>.
The command-line syntax for running <font face="Courier New" size="2">tnameserv</font> is</p>

<blockquote>
    <blockquote>
        <blockquote>
            <p><font face="Lucida Console" size="2">tnameserv [-ORBInitialPort
            ####]</font></p>
        </blockquote>
    </blockquote>
</blockquote>

<p>The <font face="Courier New" size="2">tnameserv</font> runs on
port 900 unless specified otherwise using the <font face="Courier New" size="2">-ORBInitialPort</font> command-line parameter</p>

<blockquote>
    <blockquote>
        <blockquote>
            <p><font face="Lucida Console" size="2">F:\&gt;<br>
            F:\&gt;<b>tnameserv</b><br>
            Initial Naming Context:<br>
            IOR:000000000000002849444c3a6f6d672e6f72672f436f734e616d696e672f4e616d696e67<br>
            436f6e746578743a312e30000000000100000000000000300001000000000008686f6d655f<br>
            7063000874000000000018afabcafe000000025e1c358b000000080000000000000000<br>
            TransientNameServer: setting port for initial object
            references to: 900</font></p>
        </blockquote>
    </blockquote>
</blockquote>

<p><font face="Univers (W1),Arial" size="4"><b><u>Start the CORBA
TimeServer</u></b></font></p>

<blockquote>
    <blockquote>
        <blockquote>
            <p><font face="Lucida Console" size="2">F:\&gt;<br>
            F:\&gt;java ex1.Server</font></p>
        </blockquote>
    </blockquote>
</blockquote>

<p><font face="Univers (W1),Arial" size="4"><b><u>Execute the
Time Server client</u></b></font></p>

<blockquote>
    <blockquote>
        <blockquote>
            <p><font face="Lucida Console" size="2">F:\&gt;</font><font face="Lucida Console" size="1"><br>
            </font><font face="Lucida Console" size="2">F:\&gt;<b>java
            ex1.Client</b></font><font face="Lucida Console" size="1"><br>
            </font><font face="Lucida Console" size="2">Time on
            the Server is January 10, 1999 AD, 03:37:27:868 PM</font><font face="Lucida Console" size="1"><br>
            </font><font face="Lucida Console" size="2">F:\&gt;</font></p>
        </blockquote>
    </blockquote>
</blockquote>

<p>You can always refer to my Homepage at <a href="http://www.execpc.com/%7Egopalan/"><font face="Courier New">http://www.execpc.com/~gopalan</font></a>
for more CORBA source code. Another good resource is the <a href="mailto:comp-object-corba@omg.org"><font face="Courier New">comp-object-corba@omg.org</font></a>
mailing list from OMG. You can get the CORBA specs from <a href="http://www.omg.org/"><font face="Courier New">http://www.omg.org</font></a>.
</p>

<p><a href="http://gsraj.tripod.com/corba/chapter/javaidl_2.html"><font face="Univers (W1),Arial" size="5"><b>Go to Part 3 of this article</b></font></a></p>
<div align="left">

<table bgcolor="#C0C0C0" border="1">
    <tbody><tr>
        <td><a href="http://www.execpc.com/%7Egopalan/corba/corba.html"><font face="Verdana" size="3">click here to go to</font><font face="Verdana" size="5"> </font><font size="4"><br>
        </font><font face="Verdana" size="5">My CORBA HomePage...</font></a></td>
    </tr>
</tbody></table>
</div>

<p>&nbsp;</p>
<div align="center"><center>

<table border="1" cellpadding="2" width="95%">
    <tbody><tr>
        <td bgcolor="#004080" valign="top" width="100%"><font color="#FFCC00" face="Verdana" size="4">About the Author...</font></td>
    </tr>
    <tr>
        <td bgcolor="#FFF2F2" width="100%"><font face="Tahoma" size="2"><strong>Gopalan Suresh Raj </strong>is a
        Software Architect, Developer and an active Author. He is
        contributing author to a couple of books "<strong>Enterprise
        Java Computing-Applications and Architecture</strong>"
        and "<strong>The Awesome Power of JavaBeans</strong>".
        His expertise spans enterprise component architectures
        and distributed object computing. Visit him at his </font><a href="http://www.execpc.com/%7Egopalan"><font face="Tahoma" size="2"><strong>Web Cornucopia</strong><sup><strong>©</strong></sup></font></a><font face="Tahoma" size="2"> site (<strong>http://www.execpc.com/~gopalan</strong>)
        or mail him at </font><a href="mailto:gopalan@execpc.com"><font face="Tahoma" size="2"><strong>gopalan@execpc.com</strong></font></a><font face="Tahoma" size="2">.</font></td>
    </tr>
</tbody></table>
</center></div>

<hr>

<table border="0" cellpadding="0" cellspacing="0" width="100%">
    <tbody><tr>
        <td align="center"><p align="center"><a href="http://www.execpc.com/%7Egopalan/index.html"><font color="#000000"><img src="Server_files/home2.htm" alt="Go to the Component Engineering Cornucopia page" start="fileopen" height="44" width="65"></font></a></p>
        </td>
        <td colspan="2" align="center"><p align="center"><font color="#000080" face="Arial Narrow" size="4"><strong>This
        site was developed and is maintained by </strong></font><a href="http://www.execpc.com/%7Egopalan/personal/cv.html" style="COLOR: rgb(0,0,128)"><font color="#000080" face="Arial Narrow" size="4"><strong>Gopalan Suresh Raj</strong></font></a></p>
        <p align="center"><font color="#000080" face="Arial Narrow" size="4"><strong>This page has been visited </strong></font><font color="#000080"><img src="Server_files/nph-count"></font><font color="#000080" face="Arial Narrow" size="4"><strong>
        times since September 21,1998.</strong></font></p>
        </td>
    </tr>
</tbody></table>

<table border="0" cellpadding="0" cellspacing="0" width="100%">
    <tbody><tr>
        <td align="center"><p align="center"><font color="#800000" size="3">Last Updated : Dec 19, '98</font></p>
        </td>
        <td colspan="2"><p align="center"><a href="mailto:gopalan@execpc.com"><font color="#800000" face="Arial Narrow" size="4">If you have any questions,
        comments, or problems regarding this site, please write
        to me I would love to hear from you</font></a><font color="#800000" face="Arial Narrow" size="4">.</font></p>
        </td>
    </tr>
</tbody></table>

<hr>
<div align="center"><center>

<table height="54" border="0" cellspacing="1" width="693">
    <tbody><tr>
        <td height="27" width="689"><p align="center"><font color="#000000" face="Courier New" size="1">Copyright (c)
        1997-99, </font><a href="http://www.execpc.com/%7Egopalan/personal/cv.html" style="COLOR: rgb(0,0,128)"><font color="#000000" face="Courier New" size="1">Gopalan Suresh Raj</font></a><font color="#000000" face="Courier New" size="1"> - All rights
        reserved. </font><a href="http://www.execpc.com/%7Egopalan/misc/cpright.html" style="COLOR: rgb(0,0,128)"><font color="#000000" face="Courier New" size="1">Terms of use</font></a><font color="#000000" face="Courier New" size="1">.</font></p>
        </td>
    </tr>
    <tr>
        <td height="27" width="689"><p align="center"><font color="#000000" face="Courier New" size="1">All products
        and companies mentioned at this site,are trademarks of
        their respective owners.</font></p>
        </td>
    </tr>
</tbody></table>
</center></div>

<p>&nbsp;</p>
<!-- start of NedStat code -->
<p align="center"><a href="http://usa.nedstat.net/cgi-bin/viewstat?name=java_tutorial"><img src="Server_files/nedstat.gif" align="right" border="0" hspace="0"></a> <!-- end of NedStat code --> </p>
<script language="JavaScript">
<!--
  document.write("<img src=\"http://usa.nedstat.net/cgi-bin/referstat.gif?name=java_tutorial&refer="+escape(top.document.referrer)+"\" width=1 height=1 alt=\"\">");
// -->
</script><img src="Server_files/referstat.gif" alt="" height="1" width="1">

<p><a href="http://cgi2.fxweb.com/v2-openstat.cgi?userid=J59138&amp;password2=tracker"><img src="Server_files/v2-trackrun.htm"></a></p>


<img src="Server_files/pixel_002.gif" height="1" width="1"><div id="FooterAd" style="background: none repeat scroll 0% 0% rgb(223, 220, 207); border-top: 1px solid rgb(57, 57, 57); clear: both; display: block; width: 100% ! important; position: relative; z-index: 999999 ! important; height: 90px ! important;"> 
	<div class="adCenterClass" style="display:block!important; overflow:hidden; width:916px;">
	<a href="http://adtrack.ministerial5.com/clicknew/?a=637394" title="build your own website at Tripod.com" style="float:left; display:block; width:186px; border:0">
    	<img src="Server_files/freeAd2.jpg" alt="Make your own free website on Tripod.com" style="border:0; display:block; ">
    </a> 
        <div id="footerAd_container" style="display:block!important; float:left; width:728px">
        <iframe src="Server_files/footerAd.htm" id="lycosFooterAdiFrame" style="border:0; display:block; float:left; height:96px; overflow:hidden; padding:0; width:750px"></iframe>
        <!-- <script type="text/javascript">document.write(lycos_ad['leaderboard2']);</script> -->
        </div>
	</div>
</div></body></html>