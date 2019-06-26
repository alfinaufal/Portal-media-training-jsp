package org.apache.jsp.views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "layouts/head.jsp" + "?" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode("title", request.getCharacterEncoding())+ "=" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode("Home", request.getCharacterEncoding()), out, false);
      out.write("\n");
      out.write("     <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css\" integrity=\"sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T\" crossorigin=\"anonymous\">\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "layouts/navbar.jsp", out, false);
      out.write("\n");
      out.write("        <div id=\"carouselExampleIndicators\" class=\"carousel slide\" data-ride=\"carousel\">\n");
      out.write("                <ol class=\"carousel-indicators\">\n");
      out.write("                  <li data-target=\"#carouselExampleIndicators\" data-slide-to=\"0\" class=\"active\"></li>\n");
      out.write("                  <li data-target=\"#carouselExampleIndicators\" data-slide-to=\"1\"></li>\n");
      out.write("                  <li data-target=\"#carouselExampleIndicators\" data-slide-to=\"2\"></li>\n");
      out.write("                </ol>\n");
      out.write("                <div class=\"carousel-inner\">\n");
      out.write("                  <div class=\"carousel-item active\">\n");
      out.write("                    <img src=\"https://via.placeholder.com/728x300.png/2c3e50/ffffff?text=Learn+With+Hudya\" class=\"d-block w-100\" alt=\"...\">\n");
      out.write("                  </div>\n");
      out.write("                  <div class=\"carousel-item\">\n");
      out.write("                    <img src=\"https://via.placeholder.com/728x300.png/2c3e50/ffffff?text=Learn+With+Hudya\" class=\"d-block w-100\" alt=\"...\">\n");
      out.write("                  </div>\n");
      out.write("                  <div class=\"carousel-item\">\n");
      out.write("                    <img src=\"https://via.placeholder.com/728x300.png/2c3e50/ffffff?text=Learn+With+Hudya\" class=\"d-block w-100\" alt=\"...\">\n");
      out.write("                  </div>\n");
      out.write("                </div>\n");
      out.write("                <a class=\"carousel-control-prev\" href=\"#carouselExampleIndicators\" role=\"button\" data-slide=\"prev\">\n");
      out.write("                  <span class=\"carousel-control-prev-icon\" aria-hidden=\"true\"></span>\n");
      out.write("                  <span class=\"sr-only\">Previous</span>\n");
      out.write("                </a>\n");
      out.write("                <a class=\"carousel-control-next\" href=\"#carouselExampleIndicators\" role=\"button\" data-slide=\"next\">\n");
      out.write("                  <span class=\"carousel-control-next-icon\" aria-hidden=\"true\"></span>\n");
      out.write("                  <span class=\"sr-only\">Next</span>\n");
      out.write("                </a>\n");
      out.write("              </div>\n");
      out.write("      <div class=\"container\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-md-12\">\n");
      out.write("                        <div class=\"jumbotron mt-3\">\n");
      out.write("                                <h1 class=\"display-4\">Hello, world!</h1>\n");
      out.write("                                <p class=\"lead\">This is a simple hero unit, a simple jumbotron-style component for calling extra attention to featured content or information.</p>\n");
      out.write("                                <hr class=\"my-4\">\n");
      out.write("                                <p>It uses utility classes for typography and spacing to space content out within the larger container.</p>\n");
      out.write("                                <a class=\"btn btn-primary btn-lg\" href=\"#\" role=\"button\">Learn more</a>\n");
      out.write("                            </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-md-8 p-5\">\n");
      out.write("                    <div class=\"row\">\n");
      out.write("                        <div class=\"col-md-6\">\n");
      out.write("                                <div class=\"card\">\n");
      out.write("                                        <div class=\"card-header text-uppercase text-center\">\n");
      out.write("                                            <h3>Kemana perginya Mantan?</h3>\n");
      out.write("                                        </div>\n");
      out.write("                                        <div class=\"card-body text-center\">\n");
      out.write("                                            <img src=\"public/assets/img/1.jpg\" width=\"180\" height=\"150\" class=\"img-responsive\"/>\n");
      out.write("                                            <p class=\"pt-3\">Mantan, adalah kata paling menyeramkan di dunia percintaan [...]</p>\n");
      out.write("                                            <a href=\"portal-media/views/detail.jsp\" class=\"btn btn-sm btn-primary\">Selengkapnya</a>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"col-md-6\">\n");
      out.write("                                <div class=\"card\">\n");
      out.write("                                        <div class=\"card-header text-uppercase text-center\">\n");
      out.write("                                            <h3>Kemana perginya Mantan?</h3>\n");
      out.write("                                        </div>\n");
      out.write("                                        <div class=\"card-body text-center\">\n");
      out.write("                                                <img src=\"assets/img/chelsea-islan.jpg\" width=\"180\" height=\"150\" class=\"img-responsive\"/>\n");
      out.write("                                            <p class=\"pt-3\">Mantan, adalah kata paling menyeramkan di dunia percintaan [...]</p>\n");
      out.write("                                            <a href=\"portal-media/views/detail.jsp\" class=\"btn btn-sm btn-primary\">Selengkapnya</a>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-md-4 p-5\">\n");
      out.write("                    <div class=\"row\">\n");
      out.write("                        <div class=\"col-md-6\">\n");
      out.write("                            <p>My website is a website created by Hudya. This website using Bootstrap 4. Bootstrap is Amazing!</p>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"col-md-6\">\n");
      out.write("                                <img src=\"https://via.placeholder.com/150.png/2c3e50/ffffff?text=Learn+With+Hudya\" class=\"img-responsive\" />\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("      </div>\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "layouts/footer.jsp", out, false);
      out.write("\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "layouts/scripts.jsp", out, false);
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
