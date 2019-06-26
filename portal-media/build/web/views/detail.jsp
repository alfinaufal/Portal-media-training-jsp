<%-- 
    Document   : detail
    Created on : Jun 26, 2019, 4:34:15 PM
    Author     : Alfi Naufal
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
    <jsp:include page="layouts/head.jsp">
        <jsp:param name="title" value="Home"/>
    </jsp:include>
     <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
    </head>
    <body>
        <jsp:include page="layouts/navbar.jsp"></jsp:include>
        <div class="container">
            <div class="row">
                <div class="col-md-2 p-5">
                </div>
                <div class="col-md-8 p-5">
                    <div class="row">
                        <div class="col-md-12">
                            <div class="row">
                                <div class="col-md-12">
                                    <h3 class="text-uppercase font-weight-bold">Who Is Alan Turning?</h3>
                                </div>
                                <div class="col-md-6">
                                    <p class="text-muted">Create by: Alfi Naufal</p>
                                </div>
                                <div class="col-md-6 text-right">
                                    <p class="text-muted">Wednesday, 26 Jun 2019</p>
                                </div>
                            </div>
                        </div>
                        <div class="col-md-12 text-center">
                            <img src="https://www.biography.com/.image/ar_1:1%2Cc_fill%2Ccs_srgb%2Cg_face%2Cq_auto:good%2Cw_300/MTE5NDg0MDU1MTUzMTE2Njg3/alan-turing-9512017-1-402.jpg" width="100%">
                            <p class="text-muted pt-2">Alan Turning</p>
                        </div>
                        <div class="col-md-12 text-justify mb-5">
                            <p>Alan Turing was born on June 23, 1912, in London. In his seminal 1936 paper, he proved that there cannot exist any universalalgorithmic method of determining truth in mathematics, and that mathematics will always contain undecidable propositions..</p>
                            <p>hat paper also introduced the "Turing machine. His papers on the subject are widely acknowledged as the foundation of research in artificial intelligence.</p>
                            </div>
                    </div>
                </div>
                <div class="col-md-2 p-5"></div>
            </div>
      </div>
        <jsp:include page="layouts/footer.jsp"></jsp:include>
        <jsp:include page="layouts/scripts.jsp"></jsp:include>
    </body>
</html>
