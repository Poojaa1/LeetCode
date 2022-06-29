class Solution:
    def finalValueAfterOperations(self, operations: List[str]) -> int:
        x=0
        for work in operations:
            if(work.startswith('++') or work.endswith('++')):
                x+=1
            else:
                x=x-1
        return x