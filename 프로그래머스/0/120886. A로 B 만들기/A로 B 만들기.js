function solution(before, after) {
    let arrBefore = before.split('').sort();
    let arrAfter = after.split('').sort();
    
    for(let i = 0; i < arrBefore.length; i++) {
        if(arrBefore[i] !== arrAfter[i])
            return 0;
    }
    return 1;
}