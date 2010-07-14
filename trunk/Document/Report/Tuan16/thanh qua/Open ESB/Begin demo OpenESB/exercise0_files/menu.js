
/**
 *  Global variable that holds the complete menu structure
 */
var oemenu = [
{
  	title: "Community",
  	href:  "javascript:none",
  	children: [
  		{ title: "About", href: "https://open-esb.dev.java.net/AboutOpenEsb.html" },
  		{ title: "Contact us", href: "https://open-esb.dev.java.net/ContactUs.html" },
  		{ title: "Mailing lists", href: "https://open-esb.dev.java.net/MailingLists.html" },
  		{ title: "Issue tracker", href: "https://open-esb.dev.java.net/IssueTracker.html" },
  		{ title: "Road map", href: "https://open-esb.dev.java.net/Roadmap.html" },
  		{ title: "Governance", href: "https://open-esb.dev.java.net/Governance.html" }
  	]
},
{
  	title: "Download",
  	href:  "https://open-esb.dev.java.net/Downloads.html"
},
{
  	title: "Documentation",
  	href:  "javascript:none",
  	children: [
//  		{ title: "5 min tutorial", href: "https://open-esb.dev.java.net/5minTutorial.html" },
//  		{ title: "5 min video", href: "https://open-esb.dev.java.net/5minVideo.html" },
//  		{ title: "Getting started guide", href: "https://open-esb.dev.java.net/GettingStartedGuide.html" },
//		{ href: "https://open-esb.dev.java.net/GettingStartedGuide.html", title: "Getting started guide" },
//		{ href: "https://open-esb.dev.java.net/DeploymentGuide.html", title: "Deployment guide" },
//		{ href: "https://open-esb.dev.java.net/ClusteringGuide.html", title: "Clustering guide" },
//		{ href: "https://open-esb.dev.java.net/ReferenceGuides.html", title: "Reference guides" },
		{ href: "http://wiki.open-esb.java.net/Wiki.jsp?page=FAQ", title: "FAQ" },
		{ href: "https://open-esb.dev.java.net/Books.html", title: "Books" },
		{ href: "http://wiki.open-esb.java.net/Wiki.jsp?page=Documentation", title: "OpenESB Documentation" },
		{ href: "http://wiki.open-esb.java.net/Wiki.jsp?page=GlassFishESBDocs", title: "GlassFish ESB Documentation" }
  	]
},
{
  	title: "Support",
  	href:  "https://open-esb.dev.java.net/ProductSupport.html"
},
{
  	title: "Projects",
  	href:  "javascript:none",
  	children: [
		{ href: "javascript:none", title: "Components", typestyle: "cathead" },
			{ href: "http://wiki.open-esb.java.net/Wiki.jsp?page=BPELSE", title: "BPEL SE" },
			{ href: "http://wiki.open-esb.java.net/Wiki.jsp?page=IEPSE", title: "Event Processor SE" },
			{ href: "http://wiki.open-esb.java.net/Wiki.jsp?page=HTTPBC", title: "HTTP/SOAP BC" },
			{ href: "https://open-esb.dev.java.net/Components.html", title: "All components..." },
		{ href: "javascript:none", title: "Platform", typestyle: "cathead" },
			{ href: "http://wiki.open-esb.java.net/Wiki.jsp?page=Encoders", title: "Encoders" },
			{ href: "http://wiki.open-esb.java.net/Wiki.jsp?page=OpenESBJavaSE", title: "OpenESB on bare JVM" },
			{ href: "http://wiki.open-esb.java.net/Wiki.jsp?page=OpenESBJBoss", title: "Port to JBoss" },
			{ href: "http://wiki.open-esb.java.net/Wiki.jsp?page=OpenESBWebSphere", title: "Port to WebSphere" },
			{ href: "https://open-esb.dev.java.net/Platform.html", title: "All platform facilities..." },
		{ href: "javascript:none", title: "Sub projects", typestyle: "cathead" },
			{ href: "https://open-jbi-components.dev.java.net/", title: "Open JBI Components" },
			{ href: "https://fuji.dev.java.net", title: "Fuji (incubator)" },
			{ href: "https://openesb-glassfish-addons.dev.java.net/", title: "GlassFish Addons" },
			{ href: "https://jmsjca.dev.java.net/", title: "JMSJCA" },
			{ href: "https://esb-console.dev.java.net/", title: "ESB Console (incubator)" },
			{ href: "https://keychain.dev.java.net/", title: "Keychain" },
			{ href: "https://open-esb.dev.java.net/Subprojects.html", title: "All sub projects..." }
	]
},
{
  	title: "Developer zone",
  	href:  "javascript:none",
  	children: [
		{ href: "https://open-esb.dev.java.net/SourceAccess.html", title: "Source access & build instructions" },
//		{ href: "https://open-esb.dev.java.net/ContributionProcess.html", title: "Contribution process" },
		{ href: "https://open-esb.dev.java.net/ContributionProcess.html", title: "Become a contributor" },
		{ href: "http://wiki.open-esb.java.net/Wiki.jsp?page=HelpWantedForOpenESB", title: "Help wanted" },
		{ href: "https://open-esb.dev.java.net/DevelopingComponents.html", title: "Developing components" }
	]
},
{
  	title: "Partners",
  	href:  "javascript:none",
  	children: [
		{ href: "https://open-esb.dev.java.net/CommunityPartnerDirectory.html", title: "Community partners" },
		{ href: "https://open-esb.dev.java.net/ImplementationSupport.html", title: "Implementation support" }
	]
},
{
  	title: "Resources",
  	href:  "javascript:none",
  	children: [
		{ href: "http://wiki.open-esb.java.net/Wiki.jsp?page=BlogsofInterest", title: "Blogs" },
		{ href: "https://open-esb.dev.java.net/MiscCaseStudies.html", title: "Case Studies" },
		{ href: "https://open-esb.dev.java.net/OrganizationsUsingOpenESB.html", title: "Organizations using OpenESB" },
//		{ href: "https://open-esb.dev.java.net/Events.html", title: "Events" },
		{ href: "https://open-esb.dev.java.net/servlets/ProjectNewsList", title: "Announcements" }
		
	]
},
{
  	title: "<img src='https://open-esb.dev.java.net/images/sparkyMenu20.jpg'>",
  	href:  "https://glassfish.dev.java.net/",
  	children: [
		{ href: "http://blogs.sun.com/theaquarium", title: "<img src='https://open-esb.dev.java.net/images/logos/TheAquarium.gif'>", typestyle: "widemenu" },
		{ href: "https://mural.dev.java.net/", title: "<img src='https://open-esb.dev.java.net/images/logos/mural.gif'>", typestyle: "widemenu" },
//		{ href: "javascript:none", title: "<img src='https://open-esb.dev.java.net/images/logos/seperator.png'>", typestyle: "widemenu" },
		{ href: "https://glassfish.dev.java.net/", title: "<img src='https://open-esb.dev.java.net/images/logos/glassfish-180x36.png'>", typestyle: "widemenu" },
//		{ href: "https://mq.dev.java.net/", title: "Open Message Queue" },
		{ href: "https://opensso.dev.java.net/", title: "<img src='https://open-esb.dev.java.net/images/logos/opensso.png'>", typestyle: "widemenu" },
		{ href: "https://opends.dev.java.net/", title: "<img src='https://open-esb.dev.java.net/images/logos/opends.png'>", typestyle: "widemenu" },
		{ href: "https://portal.dev.java.net/", title: "<img src='https://open-esb.dev.java.net/images/logos/openportal.png'>", typestyle: "widemenu" },
		{ href: "https://portal.dev.java.net/", title: "<img src='https://open-esb.dev.java.net/images/logos/websynergy.png'>", typestyle: "widemenu" }
	]
}
]


/**
 * Global var that indicates if this is on IE
 */
var isIE = false;
var ieversion;
if (/MSIE (\d+\.\d+);/.test(navigator.userAgent)){ //test for MSIE x.x;
	isIE = true;
	ieversion=new Number(RegExp.$1) // capture x.x portion and store as a number
}

/**
 *  Writes the menu
 */
function writeOEMenu() {
    for (var i = 0; i < oemenu.length; i++) {
        var r = oemenu[i];
        if (isIE && ieversion >= 7) {
            document.writeln("<ul><li><a href=\"" + r.href + "\">" + r.title + "</a><table><tr><td>");
        } else if (isIE) {
            document.writeln("<ul><li><a href=\"" + r.href + "\">" + r.title + "<table><tr><td>");
        } else {
            document.writeln("<ul><li><a href=\"" + r.href + "\">" + r.title + "</a>");
        }

        if (r.children != null) {
            document.writeln("<ul>");
            for (var j = 0; j < r.children.length; j++) {
                var c = r.children[j];
                if (c.typestyle) {
                    document.writeln("<li class='" + c.typestyle + "'><a href=\"" + c.href + "\">" + c.title + "</a></li>");
                } else {
                    document.writeln("<li><a href=\"" + c.href + "\">" + c.title + "</a></li>");
        	}
            }
            document.writeln("</ul>");
        }
        if (isIE) {
            document.writeln("</td></tr></table></a></li></ul>");
        } else {
            document.writeln("</li></ul>");
        }
    }
}

