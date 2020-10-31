public class HTTP {
/*
HTTP is the protocol that governs communications between webservers and web clients (i.e. browsers). Part of the protocol includes a status code returned by the server to tell the browser the status of its most recent page request. Some of the codes and their meanings arelisted below:
    status code:
        200, OK
        201, Created
        202, Accepted
        301, Moved Permanently
        303, See Other
        304, Not Modified
        307, Temporary Redirect
        400, Bad Request
        401, Unauthorized
        403, Forbidden
        404, Not Found
        410, Gone
        500, Internal Server Error
        503, Service Unavailable

1. declare an int variable called StatusCode
2. write a if statement that prints out, on a line by itself, the appropriate label from the above list based on status.
                    Example:
                        if status code = 200
                        output: ok
                        if status code = 201:
                        output: Created
            NOTE: use single if statements ONLY. DO NOT use more that one print statement

 */
    public static void main(String[] args) {
        int ok = 200;
        int created = 201;
        int accepted = 202;
        int movedPermanently = 301;
        int seeOther = 303;
        int notModifed = 304;
        int temoraryRedirect = 307;
        int badRequest = 400;
        int unauthorized = 401;
        int forbidfen = 403;
        int notFound = 404;
        int gone = 410;
        int internalServerError = 500;
        
    }
}
