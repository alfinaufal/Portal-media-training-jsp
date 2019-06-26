package org.apache.jsp.views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class detail_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "layouts/head.jsp" + "?" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode("title", request.getCharacterEncoding())+ "=" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode("Home", request.getCharacterEncoding()), out, false);
      out.write("\n");
      out.write("     <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css\" integrity=\"sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T\" crossorigin=\"anonymous\">\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "layouts/navbar.jsp", out, false);
      out.write("\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-md-2 p-5\">\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-md-8 p-5\">\n");
      out.write("                    <div class=\"row\">\n");
      out.write("                        <div class=\"col-md-12\">\n");
      out.write("                            <div class=\"row\">\n");
      out.write("                                <div class=\"col-md-12\">\n");
      out.write("                                    <h3 class=\"text-uppercase font-weight-bold\">Kemana perginya mantan?</h3>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"col-md-6\">\n");
      out.write("                                    <p class=\"text-muted\">Ditulis oleh: M Hudya Ramadhana</p>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"col-md-6 text-right\">\n");
      out.write("                                    <p class=\"text-muted\">Sabtu, 12 Juni 2019</p>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"col-md-12 text-center\">\n");
      out.write("                            <img src=\"assets/img/anya-geraldine-main-film.jpg\" width=\"100%\">\n");
      out.write("                            <p class=\"text-muted pt-2\">Anya Geraldine q 💙</p>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"col-md-12 text-justify mb-5\">\n");
      out.write("                            <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Duis vulputate nisi et arcu elementum, vel pretium lacus porta. Nulla ac efficitur dui, quis dictum orci. Quisque metus orci, ullamcorper non interdum eget, molestie ac velit. Cras nec metus a urna molestie tincidunt. Integer vel sapien a mauris egestas suscipit ac ac ante. Nulla facilisi. Curabitur non tellus posuere, dictum urna scelerisque, tincidunt tellus. Sed nisl ante, porttitor in leo eget, volutpat molestie ligula. Praesent id nunc viverra, gravida sem at, dictum lectus. Sed laoreet, mi quis imperdiet euismod, lectus sem aliquam nibh, eu feugiat arcu lectus vel urna. Integer interdum mollis mauris id ornare. Integer ac justo in urna sollicitudin finibus. </p>\n");
      out.write("                            <p>Integer sagittis volutpat turpis id feugiat. Integer facilisis diam sit amet justo lobortis, et tempor elit ornare. Proin posuere faucibus odio. Donec elementum eros a turpis rhoncus fermentum. Mauris ac tellus felis. Duis fringilla lorem condimentum interdum aliquet. Mauris ut hendrerit tellus. In odio ipsum, pulvinar at suscipit quis, tincidunt rutrum arcu. Praesent et vestibulum dolor. Suspendisse ac magna scelerisque, aliquam tortor aliquam, porttitor tellus. </p>\n");
      out.write("                            <p>Aliquam sit amet turpis id nibh tincidunt faucibus laoreet a neque. Pellentesque vitae sapien vitae libero venenatis congue nec quis purus. Integer dignissim rhoncus erat, eu bibendum sem mattis et. Fusce vitae eros at nisi egestas auctor quis ac nisl. Nullam convallis elit non massa sollicitudin, eu ultrices arcu elementum. Vestibulum vel ipsum accumsan, varius nulla vitae, varius nibh. Sed tempor lorem non turpis molestie maximus. Sed interdum lorem a elit placerat, at elementum sapien interdum. Praesent vel augue velit. Etiam volutpat mauris quam, non maximus lorem congue sed. Integer ac ante vitae risus semper condimentum et at arcu. Sed condimentum arcu odio, a tincidunt turpis pellentesque eget. Vivamus sed consectetur lacus. In quis mollis leo. Morbi at eros nec arcu tincidunt lobortis at at diam. Proin dictum diam nulla, sit amet semper tellus ullamcorper nec. </p>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-md-2 p-5\"></div>\n");
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
