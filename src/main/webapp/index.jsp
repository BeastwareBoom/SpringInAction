<html>
<body>
<h2>Hello World!</h2>
</body>
<script type="text/javascript">
    //那个按钮的onclick引用这个方法
    function scan() {
        if (window.android !== undefined) {
            window.android.scan();
        }
    }
</script>
</html>
