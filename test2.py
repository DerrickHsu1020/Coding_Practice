'''
Created on 2019/8/11

@author: FD
'''

class Solution2(object):

    def addsquare(self, nums) -> int:
        """
        :type nums: List[int]
        :rtype: int
        """ 
        total=0
        for i in nums:
            if i % 2 == 0:
                total=total+i*i                
        return total