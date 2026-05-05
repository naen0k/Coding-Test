function solution(my_string) {
    var answer = '';
    for(let x of my_string) {
        if(x === x.toLowerCase()) {
            answer += x.toUpperCase();
        } else {
            answer += x.toLowerCase();
        }
    }
    return answer;
}