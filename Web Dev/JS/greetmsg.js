<html>
    <head>
        <script>
            function GreetMsg()
            {
                var today=new Date();
                var hrs=today.getHours();
                var min=today.getMinutes();
                var sec=today.getSeconds();
                if(hrs<10)
                    alert("good morning");
                else
                    alert("have a good day mf");
            }
        </script>
    </head>
    <body onload="GreetMsg()"></body>
</html>