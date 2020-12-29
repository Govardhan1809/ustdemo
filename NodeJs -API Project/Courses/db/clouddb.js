
const DB_USER = "Gova";
const DB_PASSWORD = "1809";
const DB_NAME = "acmetravel";
const CLUSTER_HOST = "apidemo.wtflf.mongodb.net";

//DB connecting string
//mongodb+srv://deepak:<password>@apidemo.wtflf.mongodb.net/<dbname>?retryWrites=true&w=majority
exports.DB_URI= `mongodb+srv://${DB_USER}:${DB_PASSWORD}@${CLUSTER_HOST}/${DB_NAME}?retryWrites=true&w=majority`;