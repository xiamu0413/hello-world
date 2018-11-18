#---------------------------------------------#
# <aw:description>Template for Servlet</aw:description>
# <aw:version>1.1</aw:version>
# <aw:date>04/05/2003</aw:date>
# <aw:author>Ferret Renaud</aw:author>
#---------------------------------------------#

<aw:import>java.io.IOException</aw:import>
<aw:import>java.io.PrintWriter</aw:import>

<aw:import>javax.servlet.ServletException</aw:import>
<aw:import>javax.servlet.http.HttpServlet</aw:import>
<aw:import>javax.servlet.http.HttpServletRequest</aw:import>
<aw:import>javax.servlet.http.HttpServletResponse</aw:import>

<aw:parentClass>javax.servlet.http.HttpServlet</aw:parentClass>

<aw:constructor name="c1">
	/**
	 * Constructor of the object.
	 */
	public <aw:className/>() {
		super();
	}

</aw:constructor> 
 
<aw:method name="doGet">
	/**
	 * The doGet method of the servlet. <br>
	 *
	 * This method is called when a form has its tag value method equals to get.
	 * 
	 * @param request the request send by the client to the server
	 * @param response the response send by the server to the client
	 * @throws ServletException if an error occurred
	 * @throws IOException if an error occurred
	 */
	public void doGet(HttpServletRequest request, HttpServletResponse response)
		throws ServletException, IOException {

		response.setContentType("text/html;charset=utf-8");
		request.setCharacterEncoding("UTF-8");
		
	}

</aw:method>

<aw:method name="doPost">
	/**
	 * The doPost method of the servlet. <br>
	 *
	 * This method is called when a form has its tag value method equals to post.
	 * 
	 * @param request the request send by the client to the server
	 * @param response the response send by the server to the client
	 * @throws ServletException if an error occurred
	 * @throws IOException if an error occurred
	 */
	public void doPost(HttpServletRequest request, HttpServletResponse response)
		throws ServletException, IOException {

		response.setContentType("text/html");
		doGet(request,response);
		
	}

</aw:method>



