function solution(i, j, k) {
    let str = '';
    for(let m = i; m <= j; m++) {
        str += m;
    }
    const arr = str.split(k);
    return arr.length - 1;
}