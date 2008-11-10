
<html>
<head>
    <title>PDF Plugin Test</title>
    <style type="text/css">
        body {
            font-family: Arial, sans-serif;
        }
        thead td {
            font-style: italic;
            border-bottom: 1px dotted black;
        }
        tbody td {
            padding-top: 10px;
        }
    </style>
</head>
<body>
    <h1>Sample PDF Plugin test page</h1>
    <table width="100%">
        <thead>
            <tr>
                <td>Description</td>
                <td>Sample Source</td>
                <td>In Action</td>
            </tr>
        </thead>
        <tbody>
        <tr>
            <td>Simple Usage (will generate "document.pdf"):</td>
            <td>
                &lt;g:pdf url="/test.gsp"&gt;PDF View&lt;/g:pdf&gt;
            </td>
            <td>
                <g:pdf url="/test.gsp">PDF View</g:pdf>
            </td>
        </tr>
        <tr>
            <td>Using a custom filename</td>
            <td>
                &lt;g:pdf url="/test.gsp" filename="sample.pdf"&gt;sample.pdf&lt;/g:pdf&gt;
            </td>
            <td>
                <g:pdf url="/test.gsp" filename="sample.pdf">sample.pdf</g:pdf>
            </td>
        </tr>
        <tr>
            <td>Use bundled icon with no other link content</td>
            <td>
                &lt;g:pdf url="/test.gsp" filename="sample.pdf" icon="true"/&gt;
            </td>
            <td>
                <g:pdf url="/test.gsp" filename="sample.pdf" icon="true"/>
            </td>
        </tr>
        <tr>
            <td>Used bundled icon with custom link content</td>
            <td>
                &lt;g:pdf url="/test.gsp" filename="sample.pdf" icon="true"&gt;Custom link&lt;/g:pdf&gt;
            </td>
            <td>
                <g:pdf url="/test.gsp" filename="sample.pdf" icon="true">Custom link</g:pdf>
            </td>
        </tr>
        </tbody>
    </table>
    <p>

    </p>


</body>
</html>