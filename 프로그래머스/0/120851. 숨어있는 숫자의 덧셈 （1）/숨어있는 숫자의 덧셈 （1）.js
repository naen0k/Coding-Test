function solution(my_string) {
    let answer = 0;
    for(let i = 0; i < my_string.length; i++) {
        const s = my_string.charAt(i);
        if(!isNaN(s))
            answer+= parseInt(s);
    }
    return answer;
}