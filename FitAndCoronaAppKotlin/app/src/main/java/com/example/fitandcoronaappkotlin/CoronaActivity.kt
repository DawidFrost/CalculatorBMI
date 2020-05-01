package com.example.fitandcoronaappkotlin

import android.os.Bundle
import android.webkit.WebSettings
import android.webkit.WebView
import androidx.appcompat.app.AppCompatActivity

class CoronaActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_corona)

        val webView = findViewById<WebView>(R.id.webview)

        webView.settings.javaScriptEnabled=true

        webView.loadData("<html>\n" +
                "  <head>\n" +
                "    <script type=\"text/javascript\" src=\"https://www.gstatic.com/charts/loader.js\"></script>\n" +
                "    <script type=\"text/javascript\">\n" +
                "      google.charts.load('current', {'packages':['bar']});\n" +
                "      google.charts.setOnLoadCallback(drawChart);\n" +
                "\n" +
                "      function drawChart() {\n" +
                "        var data = google.visualization.arrayToDataTable([\n" +
                "          ['Country', 'Confirmed', 'Recovered', 'Deaths'],\n" +
                "          ['Italy', 86498, 10950, 9134],\n" +
                "          ['China', 81997, 75100, 3300],\n" +
                "          ['Poland',1481 , 7, 17],\n" +
                "          ['USA', 105470, 895, 1710]\n" +
                "        ]);\n" +
                "\n" +
                "        var options = {\n" +
                "          chart: {\n" +
                "            title: 'COVID by Country',\n" +
                "            subtitle: 'Confirmed, Recovered, Deaths - date 28.03.2020',\n" +
                "          }\n" +
                "        };\n" +
                "\n" +
                "        var chart = new google.charts.Bar(document.getElementById('columnchart_material'));\n" +
                "\n" +
                "        chart.draw(data, google.charts.Bar.convertOptions(options));\n" +
                "      }\n" +
                "    </script>\n" +
                "  </head>\n" +
                "  <body>\n" +
                "    <div id=\"columnchart_material\" style=\"width: 800px; height: 500px;\"></div>\n" +
                "  </body>\n" +
                "</html>\n", "text/html", "UTF-8")
    }
}
