'''
Created on 2019/8/11

@author: FD
'''
import collections
class Solution3(object):
    def order(self, words) -> str:
        """
        :type words: List[str]
        :rtype: str
        """
        if len(words) <=1:
            return ""
        
        nodes = set()
        result, zero_degree, point_in, point_out = [], collections.deque(), {}, {}
        
        for i in range(len(words)):
            for c in words[i]:
                nodes.add(c)
            if len(nodes)>26:
                break          
                
        for i in range(1, len(words)):
            if len(words[i-1]) > len(words[i]) and words[i-1][:len(words[i])] == words[i]:
                return ""
            self.relation(words[i - 1], words[i], point_in, point_out)
        
        for node in nodes:
            if node not in point_in:
                zero_degree.append(node)
         
        while zero_degree:
            curr = zero_degree.popleft()
            result.append(curr)
             
            if curr in point_out:
                for c in point_out[curr]:
                    point_in[c].discard(curr)
                    if not point_in[c]:
                        zero_degree.append(c)
             
                del point_out[curr]
         
        if point_out:
            return ""
 
        return "".join(result)
        
    
    def relation(self, word1, word2, point_in, point_out):
        str_len = min(len(word1), len(word2))
        for i in range(str_len):
            if word1[i] != word2[i]:
                if word2[i] not in point_in:
                    point_in[word2[i]] = set()
                if word1[i] not in point_out:
                    point_out[word1[i]] = set()
                point_in[word2[i]].add(word1[i])
                point_out[word1[i]].add(word2[i])
                break
                