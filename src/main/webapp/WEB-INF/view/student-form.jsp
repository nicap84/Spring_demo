<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html>
    <head>
        <title>Student registration form</title>
    </head>
    <body>
        <form:form action="processForm" modelAttribute="student">
            First name: <form:input path="firstName" />
            <br><br>

            LastName name: <form:input path="lastName" />
            <br><br>

            <form:select path="country">
                <form:options items="${theCountryOptions}" />
            </form:select>
            <br><br>

            Java <form:radiobutton path="favouriteLanguage" value="java" />
            Python <form:radiobutton path="favouriteLanguage" value="python" />
            Php <form:radiobutton path="favouriteLanguage" value="php" />
            Ruby <form:radiobutton path="favouriteLanguage" value="ruby" />
            <br><br>

            Linux <form:checkbox path="operatingSystem" value="linux" />
            Mac OS <form:checkbox path="operatingSystem" value="macos" />
            Windows <form:checkbox path="operatingSystem" value="windows" />
            <br><br>

            <input type="submit" value="Submit" />
        </form:form>
    </body>
</html>