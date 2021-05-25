


def evalRPN(tokens):
    operators = ["+", "-", "*", "/"]
    
    def evaluate(tokens):
        
        if len(tokens) == 1:
            return int(tokens[0])
        
        splitCounter = 1
        for i in reversed(range(len(tokens)-1)):
            if tokens[i] in operators:
                splitCounter += 1
            else:
                splitCounter -= 1
            
            if splitCounter == 0:
                firstHalf = evaluate(tokens[:i])
                secondHalf = evaluate(tokens[i:len(tokens)-1])
                
                if tokens[-1] == "+":
                    return firstHalf + secondHalf
                elif tokens[-1] == "-":
                    return firstHalf - secondHalf
                elif tokens[-1] == "*":
                    return firstHalf * secondHalf
                elif tokens[-1] == "/":
                    return int(firstHalf / secondHalf)
                
    return evaluate(tokens)
    
print(evalRPN(["10","6","9","3","+","-11","*","/","*","17","+","5","+"]))