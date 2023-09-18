import sys
from heapq import heapify, heappush, heappop

def Dijsktra(graph,src,dest):
    inf = sys.maxsize
    node_data = {'A':{'cost': inf, 'predecessor':[]},
    'B':{'cost': inf, 'predecessor':[]},
    'C':{'cost': inf, 'predecessor':[]},
    'D':{'cost': inf, 'predecessor':[]},
    'E':{'cost': inf, 'predecessor':[]},
    'F':{'cost': inf, 'predecessor':[]},
    }
    node_data[src]['cost'] = 0
    visited = []
    temp = src

    for i in range(5):
        if temp not in visited:
            visited.append(temp)
            min_heap = []
            for j in graph[temp]:
                if j not in visited:
                    cost = node_data[temp]['cost'] + graph[temp][j]
                    if cost < node_data[j]['cost']:
                        node_data[j]['cost'] = cost
                        node_data[j]['predecessor'] = node_data[temp]['predecessor'] + list(temp)
                    heappush(min_heap,(node_data[j]['cost'],j))
        heapify(min_heap)
        temp = min_heap[0][1] 
    print("Shortest Distance to the problem is  : " + str(node_data[dest]['cost']))
    print("Shortest path to the problem is : " + str(node_data[dest]['predecessor'] + list(dest)))       



if __name__ == "__main__":
    graph = {
        'A':{'B':2 , 'C':5},
        'B':{'A':2, 'C':4, 'D': 7},
        'C':{'A':2, 'B':4, 'E': 9, 'D': 6},
        'D':{'B':2, 'C':4, 'E': 9, 'F': 6},
        'E':{'C':2, 'D':4, 'F': 9,},
        'F':{'D':15, 'E':12,}
    }
        
    source = 'A'
    destination = 'F'
    Dijsktra(graph,source,destination)
