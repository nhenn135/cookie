function main() {
    var distance = parseInt(readLine(), 10);
    //your code goes here
    const speed = 40; 
    const time = distance/speed; 
    const timeInMinutes= time*60;
    console.log(timeInMinutes );
}