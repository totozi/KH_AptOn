<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">

<head>
  <meta charset="utf-8">
  <meta content="width=device-width, initial-scale=1.0" name="viewport">

  <title>공지사항</title>
  <meta content="" name="description">
  <meta content="" name="keywords">

  <!-- Favicons -->
  <link href="resources/img/favicon.png" rel="icon">
  <link href="resources/img/apple-touch-icon.png" rel="apple-touch-icon">

  <!-- Google Fonts -->
  <link href="https://fonts.googleapis.com/css?family=Open+Sans:300,300i,400,400i,600,600i,700,700i|Raleway:300,300i,400,400i,500,500i,600,600i,700,700i|Poppins:300,300i,400,400i,500,500i,600,600i,700,700i" rel="stylesheet">

  <!-- Vendor CSS Files -->
  <link href="resources/vendor/bootstrap/css/bootstrap.min.css" rel="stylesheet">
  <link href="resources/vendor/bootstrap-icons/bootstrap-icons.css" rel="stylesheet">
  <link href="resources/vendor/boxicons/css/boxicons.min.css" rel="stylesheet">
  <link href="resources/vendor/glightbox/css/glightbox.min.css" rel="stylesheet">
  <link href="resources/vendor/swiper/swiper-bundle.min.css" rel="stylesheet">

  <!-- Template Main CSS File -->
  <link href="resources/css/style.css" rel="stylesheet">

  <!-- =======================================================
  * Template Name: Lumia - v4.6.0
  * Template URL: https://bootstrapmade.com/lumia-bootstrap-business-template/
  * Author: BootstrapMade.com
  * License: https://bootstrapmade.com/license/
  ======================================================== -->
  <script src="https://use.fontawesome.com/releases/v5.2.0/js/all.js"></script>
  
 <style>
 ul {
 list-style-type: none;
 }
 
 #aside {
 	float: left;
 	width: 200px;
 }
 #mainsection {
 	float: left;
 	width: 1200px;
 }
 table {
	 border: 1px solid black;
	 width: 1100px;
	 text-align: center;
 }
 #rowheader {
	 font-weight: bold;
	 text-align: center;
	 background-color: #ccc;
 }
 .completestate {
	 font-weight: bold;
 }
 footer {
 	clear: both;
 }
 #btnWriteBox {
 	float: right;
 }
 #btnwrite {
	 broder: none;
	 border-radius: 5px;
	 color: white;
	 padding: 15px 32px;
	 text-align: center;
	 font-size: 16px;
	 margin: 4px 2px;
	 cursor: pointer;
	 background-color: #008CBA;
 }
 
 /*상세페이지  */
  
  
#th1{
	width:600px;
	height:35px;
	text-align:left;
	padding:0 5px 0 5px;
	background-color:rgb(201, 242, 252);
}

td{
		word-break:break-all;
		word-wrap:break-word;
	}
 #td1{
     width:700px;
     text-align:left;
 }   
     th,td{
        
        border-bottom: 1px solid #b4b1b1;
        padding: 10px;
    } 
    #div1{
	width: 1000px;
	margin-left:50px;
	margin-top:50px;
	float:left;
	padding-right:  100px;
}
#maintable{
    border-top: 1px solid #b4b1b1;
    border-collapse: collapse;
    border-left: 1px solid #b4b1b1;
    border-bottom: 1px solid #b4b1b1;
    border-right: 1px solid #b4b1b1;
}
#tolist2{
    margin-left: 550px;
    margin-top:15px;
     margin-bottom:15px;
      width: 100px;
 height: 40px;
 border: 1px solid skyblue;
  background-color: rgba(0,0,0,0);
  color: skyblue
}

 #tolist2:hover{ 
  color:white; 
  background-color: skyblue; 
  }
#tolist1{
    margin-left: 1000px;
}
#contenttd{
width:1000px; 
text-align:left;
}
 </style>
   
</head>

<body>

<!-- ========header.jsp 삽입해주세요 -->

<jsp:include page="../header.jsp" flush="true" />
<!-- ========header.jsp 삽입해주세요 -->

 



<main id="main">
<h2>노원 롯데 캐슬 - <a href="/apton/noticelist">아파트 공지사항</a></h2>

	<div id="div1">
    <table id="maintable" >
        <c:forEach items="${noticelist}" var="detail">
             <thead>
                <tr>
                    <th id="th1">제목</th>
                    <td colspan="5" id="td1">${detail.notice_title }</td>
                </tr>
                <tr>
                    <th id="th1">글 번호: </th>
                    <td id="td1">${detail.notice_num }</td>
                    <th id="th1">작성자: </th>
                    <td id="td1">${detail.admin_id }</td>
                    <th id="th1">작성일: </th>
                    <td id="td1">${detail.notice_date }</td> 
                </tr>
            </thead>
            <tbody>
                    <tr>
       
                    <td id = "contenttd" colspan="6">${detail.notice_content}</td>
                    </tr>
                </table>
<button class="tolist" id="tolist2" onclick = "location.href = '/apton/noticelist' ">목록</button>
</div>
</c:forEach>	
</main>

     <!-- ======= Footer ======= -->
<jsp:include page="../footer.jsp" flush="true" />
 


  <a href="#" class="back-to-top d-flex align-items-center justify-content-center"><i class="bi bi-arrow-up-short"></i></a>

  <!-- Vendor JS Files -->
  <script src="resources/vendor/bootstrap/js/bootstrap.bundle.min.js"></script>
  <script src="resources/vendor/glightbox/js/glightbox.min.js"></script>
  <script src="resources/vendor/isotope-layout/isotope.pkgd.min.js"></script>
  <script src="resources/vendor/php-email-form/validate.js"></script>
  <script src="resources/vendor/purecounter/purecounter.js"></script>
  <script src="resources/vendor/swiper/swiper-bundle.min.js"></script>
  <script src="resources/vendor/waypoints/noframework.waypoints.js"></script>

  <!-- Template Main JS File -->
  <script src="resources/js/main.js"></script>

</body>
</html>