AndroidPlusJS
===================

This is simple Android application with **perspective purpose**. The first idea was to create **beautiful and interactive graph** in Android app.

Motivation
-------------

I am a developer in the Aplikacni Software[^apso] company situated in Hradec Kralove. After the summer camp at CityU my first task will be including graphs to our desktop ERP system. With separated, reusable graph components we can easily build Android app with same feature.

Purpose
-------------

Purpose is to practise developing applications including Java and JavaScript. Learn how to handle communication between these two languages and how to send data from back-end to JS graph.

How
-------------

1) Create WebView component
 
2) Paste HTML template into "assets"  dir
 
3) Create bridge between Android app and Javascript (WebAppInterface class, annotated methods with @JavascriptInterface)
 
4) Thanks to WebAppInterface send data to WebView component and draw graph

  [^apso]: [ApSo](www.apso.cz) is a company from Czech Republic.
