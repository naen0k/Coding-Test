function solution(n) {
    var answer = [];
    let x = 2;
    while(n > 1) {
        if(n % x == 0) {
            if(!(answer.includes(x)))
                answer.push(x);
            n = n / x;
        } else {
            x++;
        }
    }
    return answer;
}