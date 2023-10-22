package templates;

public class Snippet {
	<!DOCTYPE html>
	<html xmlns:th="http://www.thymeleaf.org">
	<body>
	    <h2>Book Detail Form</h2>
	    <form method="post" th:object="${book}" th:action="@{/books/save}">
	        <input type="hidden" th:field="*{id}" />
	        <label for="isbn number" placeholder="Enter isbn number">Book IBSN name: </label>
	        <input type="text" th:field="*{title}" />
	        <br/>
	        <label for="Book " aria-placeholder="Enter the book name">Book Name:</label>
	        <input type="text" th:field="*{author}" />
	        <br/>
	        <label for="Author name">Author Name:</label>
	        <input type="number" th:field="*{year}" />
	        <br/>
	        <label for="role"> Role :</label>
	        
	        <select>
	            
	            <option value="user">User</option>
	            <option value="teacher"> Teacher</option>
	            
	        </select>
	        <br/>
	        <button type="submit">Save</button>
	        <button type="Reset">Reset</button>
	
	    </form>
	</body>
	</html>
	
}

