const readline = require('readline');
const rl = readline.createInterface({
    input: process.stdin,
    output: process.stdout
});
rl.question("Enter a number from 1-7 to get the day :",(input)=>{
    const dayNumber = parseInt(input);
    let dayName = "";   
    switch(dayNumber){
        case 1:
            dayName = "Monday";
            break;
        case 2:
            dayname = "Tuesday";
            break;
        case 3:
            dayName = "Wednesday";
            break;
        case 4:
            dayName = "Thursday";
            break;
        case 5:
            dayName = "Friday";
            break;
        case 6:
            dayName = "Saturday";
            break;
        case 7:
            dayName = "Sunday";
            break;
        default:
            dayName = "Invalid input! Please enter a number between 1 and 7.";
    }
    console.log(`The day is : ${dayName}`);
    rl.close();
});