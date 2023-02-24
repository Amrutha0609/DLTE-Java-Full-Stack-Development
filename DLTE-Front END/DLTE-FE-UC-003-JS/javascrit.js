function js(){
    let auth=[
    {
        "id":"amrutha",
        "password":"1234",
        "no":"9606349775",
        "status":"active",
        "account":"123456",
        "adhar":"567",
        "balance":"0",
        "pan":"23",
        "mobile":"12"

    },
    {
        "id":"prabhu",
        "password" :"5678",
        "no":"9606349775",
        "status":"active",
        "account":"123456",
        "adhar":"567",
        "balance":"0",
        "pan":"23",
        "mobile":"12"
    },
    {
        "id":"anisha",
        "password" :"9964",
        "no":"9606349775",
        "status":"active",
        "account":"123456",
        "adhar":"567",
        "balance":"0",
        "pan":"23",
        "mobile":"12"
    },

    ]
    let uid=document.forms['verification'].id.value;
    let upass=document.forms['verification'].password.value;

    js.foreach((item)=> {
        if(item.id==uid && item.password==upass){
            window.location="http://127.0.0.1:5500/UC001.HTML"
        }

    });
}