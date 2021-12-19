<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
 
<!DOCTYPE html>
<html lang="en">

<head>
  <meta charset="utf-8">
  <meta content="width=device-width, initial-scale=1.0" name="viewport">

  <title>노원 롯데캐슬 하자접수 게시판 with APTON</title>
  <!-- 공통 css 및 글꼴 입력 부분 시작, title바로 밑에 삽입  -->
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
  
  <script src="https://kit.fontawesome.com/yourcode.js" crossorigin="anonymous"></script>
  <link href="https://cdn.quilljs.com/1.3.6/quill.snow.css" rel="stylesheet">
  <script src="//cdn.quilljs.com/1.3.6/quill.js"></script>
  
<link rel="preconnect" href="https://fonts.googleapis.com">
<link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
<link href="https://fonts.googleapis.com/css2?family=Noto+Sans+KR&display=swap" rel="stylesheet">

<style>
header{
font-family: 'Noto Sans KR', sans-serif;
}
footer{
font-family: 'Noto Sans KR', sans-serif;
}
</style>

<!-- 공통 css 및 글꼴 입력 부분 끝  -->
  <script src="https://cdn.ckeditor.com/4.17.1/standard/ckeditor.js"></script>
  <script src="https://cdn.jsdelivr.net/npm/jquery@3.2.1/dist/jquery.min.js"></script>
  <script src="http://code.jquery.com/jquery-3.4.1.min.js"></script>

 
<style>
 ul {
 list-style-type: none;
 }


 #aside {
 	float: left;
 	width: 0px;
 }
 #mainsection {
 	margin: auto;
 	width: 1000px;
 }
 table {
	border-collapse: collapse;
 	border-radius: 10px 10px 0 0;
	box-shadow: 0 0 0 0.5px rgb(233 202 155);
	width: 1000px;
	text-align: center;
 }
 td {
 	width: 200px;
 }
 .completestate {
	 font-weight: bold;
 }
 footer {
 	clear: both;
 }
 #btnBox {
 	float: right;
 }
 .textContent {
 	text-align: justify;
 }
 .ck-content {
 	height: 375px;
 }  
 .img {
 	width: 240px;
 	height: 200px;
 }
  #btnWrite {
	 broder: none;
	 border-radius: 5px;
	 color: white;
	 padding: 7px 16px;
	 text-align: center;
	 font-size: 16px;
	 margin: 4px 2px;
	 cursor: pointer;
	 background-color: #008CBA;
 }
    #btnWrite:hover{
	font-size:13px;
	border : 1px solid rgba(159,220,120,1);
	border-radius:5px;
	background-color: #008CBA;
	box-shadow: 3px 3px 0 #5492DB;
	transition: all 0.5s;
 }
  #btnToBack {
	 broder: none;
	 border-radius: 5px;
	 color: white;
	 padding: 7px 16px;
	 text-align: center;
	 font-size: 16px;
	 margin: 4px 2px;
	 cursor: pointer;
	 background-color: #f44336;
 }
  #btnToBack:hover{
	font-size:16px;
	margin: 4px 2px;
	border : 1px solid rgba(159,220,120,1);
	border-radius:5px;
	background-color: #f44336;
	box-shadow: 3px 3px 0 #FF8A00;
	transition: all 0.5s;
 }
 #textTitle {
 border: none;
 width: 800px;
 }
 #textContent {
 border: none;
 width: 1000px;
 height: 375px;
 }
  h2 {
  	 margin-left: 20px;
	 margin-top: 200px;
	 margin-bottom: 20px;
 }

header{
font-family: 'Noto Sans KR', sans-serif;
}
footer{
font-family: 'Noto Sans KR', sans-serif;
}
.cke_button.cke_button__image.cke_button_off{
	display: none;
	disabled;
}
.header,#uploadTd {
	width: 200px;
	background-color: #ffebcd;
 	border: none;
 	font-weight: bold;
 }
 </style>

</head>

<body>

<!-- ========header.jsp 삽입해주세요 -->

<jsp:include page="../header.jsp" flush="true" />
<!-- ========header.jsp 삽입해주세요 -->
<aside id="aside">
<!-- 메뉴이름 및 링크는 추후 결정 -->
<ul>

</ul>
</aside>




<main id="main">


<aside id="aside">
<!-- 메뉴이름 및 링크는 추후 결정 -->
<ul>
	
</ul>
</aside>
   

<section id="mainsection">
<h2>노원 롯데 캐슬 - <a href="./board-defectreception">아파트 민원 접수</a></h2>
	<table id="maintable">
	<form id="" action="./insert-defectreception"  method="post" enctype="multipart/form-data">
		<tr>
		<td class="header">제목</td>
			<td colspan="">
			<input type="text" name="t" id="textTitle" placeholder="제목을 입력해주세요"/></td>
		</tr>

		<!-- form으로 보낼려면 name이 필요한대 에디터에서 제공해주는 플러그인이 name이 없어서 아래 input file을 사용-->
		<tr>
			<td class="header">이미지</td>
			<td colspan="" id="uploadTd">
				<input type="file" name="image" id="upload" accept="image/*" data-max-size="5000" value="res.data.link" />
			</td>	
		</tr>
		<tr>
			<td class="textContent" colspan="2">
			<textarea name="c" id="textContent" placeholder="내용을 입력해주세요"></textarea>
			</td>
		</tr>
	
	</table>
		<div>
		</div>
	<!-- SJH TODO 회원 세션일경우만 보이도록 보완필요 -->
		<div id="btnBox">
			<button type="submit" id="btnWrite">작성</button>
		</div>
	</form>
	<button type="button" id="btnToBack" onclick="btnToBack()">취소</button>
</section>
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
  <script>
  
  CKEDITOR.replace( 'textContent',{
		uiColor: '#ffebcd',
		height : '300px',
		on: {
			//글자수제한 기능
	        change: function() {
	        	var txt = CKEDITOR.instances['textContent'].getData();
	        	var len = CKEDITOR.instances['textContent'].getData().length;

	        	var stringByteLength = 0;
	        	//console.log(len);
	        	for(var i=0; i<len; i++) {
	        	    if(escape(txt.charAt(i)).length >= 4)
	        	        stringByteLength += 3;
	        	    else if(escape(txt.charAt(i)) == "%A7")
	        	        stringByteLength += 3;
	        	    else
	        	        if(escape(txt.charAt(i)) != "%0D")
	        	            stringByteLength++;
	        	}
	        	//console.log(txt);
	        	//console.log(stringByteLength + " Bytes")
	        	 document.getElementById('txtlim').value = 1507 - stringByteLength;
	        	
	        	if(stringByteLength >= 1507){
	        		alert("더 이상 입력할 수 없습니다.");
	        		document.getElementById('txtlim').value = 1507 - stringByteLength;
	        		document.getElementById('txtlim').style.color='red';
	        	} else if(document.getElementById('txtlim').value==1507){
	        		document.getElementById('txtlim').value =1500;
	        	} else {
	        		document.getElementById('txtlim').value = 1507 - stringByteLength;
	        		document.getElementById('txtlim').style.color='black';
	        	}
	        	
	        }
	  }

	});
  
  
  $("form").submit(function(){
	  if( document.getElementById("upload").files.length == 0 ){
		    alert("사진을 반드시 첨부해야 합니다.");
		    return false;
		}  
	});  
  
  
  $(document).ready(function () {
      CKEDITOR.config.removeButtons = 'Image'; 
  });
  function btnToBack(){
		window.history.go(-1);
	}	
  </script>
  
</body>
</html>