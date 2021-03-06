<!doctype html>
<html>
<head>
<meta http-equiv="content-Type" content="text/html;charset=utf-8">
<meta name="keywords" content="关键词,关键词">
<meta name="description" content="">
<title>登录注册页面</title>
<style type="text/css">
* {
	margin: 0;
	padding: 0;
} /*适配所有浏览器*/
body {
	font-size: 12px;
	font-family: "微软雅黑";
	color: #666;
	background: #A0C3D8;
}

.info {
	width: 300px;
	height: 200px;
	margin: auto;
}

.info span {
	width: 100px;
	height: 40px;
	background: yellow;
	display: block;
	float: left;
	font-size: 16px;
	text-align: center;
	color: #6F6868;
	text-align: center;
	line-height: 35px;
}

.info .text {
	width: 100px;
	height: 40px;
	border: 0;
	outline: none;
	text-indent: 16px;
	font-size: 16px;
	font-family: "微软雅黑";
}

.info .btn {
	width: 200px;
	height: 40px;
	outline: none;
	border: 0;
	font-family: "微软雅黑";
	font-size: 16px;
	color: #6F6868;
}

.info .btn:hover {
	background: #666;
	color: #fff;
}
input:disabled {
    background: #333;
}
</style>
</head>
<body>
	<div class="info">
		
		<form th:action="@{/index}" method='post'>
			<br />
			<p>
				<span>用户名：</span><input type="text" class="text" id="username"
					name="username" />
			</p>
			<br />

			<p>
				<span>密码：</span><input type="password" class="text" id="password"
					name="password" />
			</p>
			<br /> <input type="submit" value="登录POST" class="btn" />
		</form>

		<form method="post" action="/register">
			<br />
			<p>
				<span>用户名：</span><input type="text" class="text" id="username"
					name="username" onblur="check(this)" />
			</p>
			<br />

			<p>
				<span>密码：</span><input type="password" class="text" id="password"
					name="password" />
			</p>
			<br /> <input type="submit" value="注册" class="btn" id='register' />
		</form>
	</div>
	<script type="text/javascript">
		function check(input) {
			//http://localhost:8080/username?username=119
			fetch('/username?username=' + input.value).then(function(response) {
				return response.json();
			}).then(function(data) {
				console.log(data);
				if (data.code === 1) {
					alert('用户名已被注册')
					document.querySelector('#register').disabled = true;
				} else {
					document.querySelector('#register').disabled = false;
				}
			})

		}
	</script>
</body>

</html>