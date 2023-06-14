const InorderTraversal = (root) => {
    const answer = [];
    const stack = [];

    if(root === null)
        return [];

    let current = root;

    while(current !== null || stack.length !== 0){
        if(current !== null){
            stack.push(current);
            current = current.left;
        } else {
            current = stack.pop();
            answer.push(current.val);
            current = current.right;
        }
    }
    return answer;
    
};