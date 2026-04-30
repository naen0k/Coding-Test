function solution(my_string, num1, num2) {
    var answer = '';
    let temp = my_string.charAt(num1);
    for(let i = 0; i < my_string.length; i++) {
        const c = my_string.charAt(i);
        if(i === num1) 
            answer += my_string[num2];
        else if(i === num2)
            answer += temp;
        else 
            answer += c;
    }
    return answer;
}