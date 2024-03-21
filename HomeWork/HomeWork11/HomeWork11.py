from collections import deque

class HomeWork11:
    def flood_fill(self, image, sr, sc, color):
        start_color = image[sr][sc]
        queue = deque([(sr, sc)])

        while queue:
            xpos, ypos = queue.popleft()
            if 0 <= xpos < len(image) and 0 <= ypos < len(image[0]) and image[xpos][ypos] == start_color and image[xpos][ypos] != color:
                image[xpos][ypos] = color
                queue.append((xpos - 1, ypos))
                queue.append((xpos + 1, ypos))
                queue.append((xpos, ypos - 1))
                queue.append((xpos, ypos + 1))

        return image

if __name__ == "__main__":
    hw11 = HomeWork11()
    image = [
        [1, 1, 1, 1],
        [1, 1, 0, 0],
        [1, 0, 1, 0],
        [1, 0, 0, 1]
    ]
    sr = 1  # Starting row
    sc = 1  # Starting column
    color = 2  # Color to fill

    result_image = hw11.flood_fill(image, sr, sc, color)
    for row in result_image:
        print(row)
