function greet(){
    const hour = new Date().getHours;

    if(hour >= 5 && hour <= 12){
        return "Good morning"
    }
    else if(hour >= 12 && hour <= 16){
        return "Good afternoon"
    }
    else if(hour >= 17 && hour <= 18){
        return "Good evening"
    }
    else{
        return "Good night"
    }
}

module.exports = { greet }