package com.example.snakegame

class Snake {
    companion object {
        // default: just one body part
        var headX = 0f
        var headY = 0f
        var bodyParts =
            mutableListOf(arrayOf(0f, 0f))
        var direction = "right";
        var alive = false;

        fun possibleMove(): Boolean {
            if (headX < 0f || headX > 1000f || headY < 0f || headY > 1000)
                return false
            return true
        }

        fun reset() {
            headX = 0f;
            headY = 0f;
            bodyParts = mutableListOf(arrayOf(0f, 0f))
            direction = "right";
        }
    }
}