package com.example.calculatorbmi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.Button;

public class CoronaDashboardsActivity extends AppCompatActivity {
    Button nextbutton;

    String dashboard[] = {
            "<html>\n" +
                    "  <head>\n" +
                    "   <center><h4>CORONAVIRUS PANDEMIC - March 28, 2020</h4></center>"+
                    "    <script type=\"text/javascript\" src=\"https://www.gstatic.com/charts/loader.js\"></script>\n" +
                    "    <script type=\"text/javascript\">\n" +
                    "      google.charts.load(\"current\", {packages:[\"corechart\"]});\n" +
                    "      google.charts.setOnLoadCallback(drawChart);\n" +
                    "      function drawChart() {\n" +
                    "        var data = google.visualization.arrayToDataTable([\n" +
                    "          ['Total', 'People for the Day'],\n" +
                    "          ['Total cases',     104256],\n" +
                    "          ['Total deaths',      1704],\n" +
                    "          ['Total recovered',  2525],\n" +
                    "        ]);\n" +
                    "\n" +
                    "        var options = {\n" +
                    "          title: 'USA - March 28, 2020',\n" +
                    "          legend: 'bottom'\n"+
                    "        };\n" +
                    "\n" +
                    "        var chart = new google.visualization.PieChart(document.getElementById('piechart'));\n" +
                    "        chart.draw(data, options);\n" +
                    "      }\n" +
                    "    </script>\n" +
                    "  </head>\n" +
                    "  <body>\n" +
                    "   <div id=\"piechart\" style=\"width: 400px; height: 450px;\"></div>\n" +
                    "  </body>\n" +
                    "</html>",
                    "<html>\n" +
                    "  <head>\n" +
                    "   <center><h4>CORONAVIRUS PANDEMIC - March 28, 2020</h4></center>"+
                    "    <script type=\"text/javascript\" src=\"https://www.gstatic.com/charts/loader.js\"></script>\n" +
                    "    <script type=\"text/javascript\">\n" +
                    "      google.charts.load(\"current\", {packages:[\"corechart\"]});\n" +
                    "      google.charts.setOnLoadCallback(drawChart);\n" +
                    "      function drawChart() {\n" +
                    "        var data = google.visualization.arrayToDataTable([\n" +
                    "          ['Total', 'People for the Day'],\n" +
                    "          ['Total cases',     86498],\n" +
                    "          ['Total deaths',      9134],\n" +
                    "          ['Total recovered',  10950],\n" +
                    "        ]);\n" +
                    "\n" +
                    "        var options = {\n" +
                    "          title: 'Italy - March 28, 2020',\n" +
                    "          legend: 'bottom'\n"+
                    "        };\n" +
                    "\n" +
                    "        var chart = new google.visualization.PieChart(document.getElementById('piechart'));\n" +
                    "        chart.draw(data, options);\n" +
                    "      }\n" +
                    "    </script>\n" +
                    "  </head>\n" +
                    "  <body>\n" +
                    "   <div id=\"piechart\" style=\"width: 400px; height: 450px;\"></div>\n" +
                    "  </body>\n" +
                    "</html>",
                    "<html>\n" +
                    "  <head>\n" +
                    "   <center><h4>CORONAVIRUS PANDEMIC - March 28, 2020</h4></center>"+
                    "    <script type=\"text/javascript\" src=\"https://www.gstatic.com/charts/loader.js\"></script>\n" +
                    "    <script type=\"text/javascript\">\n" +
                    "      google.charts.load(\"current\", {packages:[\"corechart\"]});\n" +
                    "      google.charts.setOnLoadCallback(drawChart);\n" +
                    "      function drawChart() {\n" +
                    "        var data = google.visualization.arrayToDataTable([\n" +
                    "          ['Total', 'People for the Day'],\n" +
                    "          ['Total cases',     81394],\n" +
                    "          ['Total deaths',      3295],\n" +
                    "          ['Total recovered',  74971],\n" +
                    "        ]);\n" +
                    "\n" +
                    "        var options = {\n" +
                    "          title: 'China - March 28, 2020',\n" +
                    "          legend: 'bottom'\n"+
                    "        };\n" +
                    "\n" +
                    "        var chart = new google.visualization.PieChart(document.getElementById('piechart'));\n" +
                    "        chart.draw(data, options);\n" +
                    "      }\n" +
                    "    </script>\n" +
                    "  </head>\n" +
                    "  <body>\n" +
                    "   <div id=\"piechart\" style=\"width: 400px; height: 450px;\"></div>\n" +
                    "  </body>\n" +
                    "</html>",
                    "<html>\n" +
                    "  <head>\n" +
                    "   <center><h4>CORONAVIRUS PANDEMIC - March 28, 2020</h4></center>"+
                    "    <script type=\"text/javascript\" src=\"https://www.gstatic.com/charts/loader.js\"></script>\n" +
                    "    <script type=\"text/javascript\">\n" +
                    "      google.charts.load(\"current\", {packages:[\"corechart\"]});\n" +
                    "      google.charts.setOnLoadCallback(drawChart);\n" +
                    "      function drawChart() {\n" +
                    "        var data = google.visualization.arrayToDataTable([\n" +
                    "          ['Total', 'People for the Day'],\n" +
                    "          ['Total cases',     72248],\n" +
                    "          ['Total deaths',      5690],\n" +
                    "          ['Total recovered',  12285],\n" +
                    "        ]);\n" +
                    "\n" +
                    "        var options = {\n" +
                    "          title: 'Spain - March 28, 2020',\n" +
                    "          legend: 'bottom'\n"+
                    "        };\n" +
                    "\n" +
                    "        var chart = new google.visualization.PieChart(document.getElementById('piechart'));\n" +
                    "        chart.draw(data, options);\n" +
                    "      }\n" +
                    "    </script>\n" +
                    "  </head>\n" +
                    "  <body>\n" +
                    "   <div id=\"piechart\" style=\"width: 400px; height: 450px;\"></div>\n" +
                    "  </body>\n" +
                    "</html>",
                    "<html>\n" +
                    "  <head>\n" +
                    "   <center><h4>CORONAVIRUS PANDEMIC - March 28, 2020</h4></center>"+
                    "    <script type=\"text/javascript\" src=\"https://www.gstatic.com/charts/loader.js\"></script>\n" +
                    "    <script type=\"text/javascript\">\n" +
                    "      google.charts.load(\"current\", {packages:[\"corechart\"]});\n" +
                    "      google.charts.setOnLoadCallback(drawChart);\n" +
                    "      function drawChart() {\n" +
                    "        var data = google.visualization.arrayToDataTable([\n" +
                    "          ['Total', 'People for the Day'],\n" +
                    "          ['Total cases',     53340],\n" +
                    "          ['Total deaths',      395],\n" +
                    "          ['Total recovered',  6658],\n" +
                    "        ]);\n" +
                    "\n" +
                    "        var options = {\n" +
                    "          title: 'Germany - March 28, 2020',\n" +
                    "          legend: 'bottom'\n"+
                    "        };\n" +
                    "\n" +
                    "        var chart = new google.visualization.PieChart(document.getElementById('piechart'));\n" +
                    "        chart.draw(data, options);\n" +
                    "      }\n" +
                    "    </script>\n" +
                    "  </head>\n" +
                    "  <body>\n" +
                    "   <div id=\"piechart\" style=\"width: 400px; height: 450px;\"></div>\n" +
                    "  </body>\n" +
                    "</html>",
            "<html>\n" +
                    "  <head>\n" +
                    "   <center><h4>CORONAVIRUS PANDEMIC - March 28, 2020</h4></center>"+
                    "    <script type=\"text/javascript\" src=\"https://www.gstatic.com/charts/loader.js\"></script>\n" +
                    "    <script type=\"text/javascript\">\n" +
                    "      google.charts.load(\"current\", {packages:[\"corechart\"]});\n" +
                    "      google.charts.setOnLoadCallback(drawChart);\n" +
                    "      function drawChart() {\n" +
                    "        var data = google.visualization.arrayToDataTable([\n" +
                    "          ['Total', 'People for the Day'],\n" +
                    "          ['Total cases',     35408],\n" +
                    "          ['Total deaths',      2517],\n" +
                    "          ['Total recovered',  11679\t],\n" +
                    "        ]);\n" +
                    "\n" +
                    "        var options = {\n" +
                    "          title: 'Iran - March 28, 2020',\n" +
                    "          legend: 'bottom'\n"+
                    "        };\n" +
                    "\n" +
                    "        var chart = new google.visualization.PieChart(document.getElementById('piechart'));\n" +
                    "        chart.draw(data, options);\n" +
                    "      }\n" +
                    "    </script>\n" +
                    "  </head>\n" +
                    "  <body>\n" +
                    "   <div id=\"piechart\" style=\"width: 400px; height: 450px;\"></div>\n" +
                    "  </body>\n" +
                    "</html>"};

        String actualElement;
        int i=0;
    private WebView webView = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_corona_dashboards);

        nextbutton=(Button)findViewById(R.id.nextbutton);
        webView = (WebView) findViewById(R.id.webview);
        WebSettings webSettings = webView.getSettings();
        webSettings.setJavaScriptEnabled(true);

        actualElement=dashboard[i];

        //first canvas
        if(i==0) {
            webView.loadData(actualElement, "text/html", "UTF-8");
        }

        nextbutton.setOnClickListener(new View.OnClickListener() {
            //next canvases
            @Override
            public void onClick(View v) {
                if (i<dashboard.length-1) {
                    actualElement = dashboard[i + 1];
                }
                i = i + 1;
                //change button
                if (i==5)
                {
                    nextbutton.setText("End");
                }
                // (ET) go to home or render next canvas :)
                if(i==6){
                    i=0;
                    openHomeActivity();
                }else {
                    CoronaDashboardsActivity.this.webView.loadData(actualElement, "text/html", "UTF-8");
                }
            }
        });




    }
    public void openHomeActivity(){
        Intent intent = new Intent(this,HomeActivity.class);
        startActivity(intent);
    }


    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if ((keyCode == KeyEvent.KEYCODE_BACK) && this.webView.canGoBack()) {
            this.webView.goBack();
            return true;
        }

        return super.onKeyDown(keyCode, event);
    }

}