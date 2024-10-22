package com.example.a30days_card

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.appcompat.widget.Toolbar

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val toolbar: Toolbar = findViewById(R.id.toolbar)
        setSupportActionBar(toolbar)
        supportActionBar?.title = "30 Days of Dance Choreography"

        val recyclerView: RecyclerView = findViewById(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)

        val tip_of_the_day = listOf(
            tip("Day 1: Hip-Hop Basics", "Master the Bounce!","Start your hip-hop journey by mastering the bounce. " +
                    "It’s the foundation of many hip-hop moves, focusing on rhythm and groove.", R.drawable.day1),
            tip("Day 2: The Two-Step", "Keep it Simple","Learn the essential two-step. It's a basic, versatile move to build your coordination and groove.",R.drawable.day2),
            tip("Day 3: The Dougie", "Do the Dougie","Hit the Dougie, a fun and easy move that lets you get loose and add your own flavor.", R.drawable.day3),
            tip("Day 4: Chest Pop", "Pop it Out!","Isolate and pop your chest to get into popping basics. Control and sharpness are key!", R.drawable.day4),
            tip("Day 5: Body Rolls", "Roll with the Beat","Learn how to smoothly execute body rolls, adding waves and flow to your movements.", R.drawable.day5),
            tip("Day 6: The Groove Step", "Find Your Groove","Groove is the heart of hip-hop. Practice the groove step to build rhythm and musicality.", R.drawable.day6),
            tip("Day 7: The Running Man", "Run with It","Master the running man, a classic move in hip-hop that adds energy and bounce to your dance.", R.drawable.day7),
            tip("Day 8: Isolations", "Control Your Movement","Work on isolating different body parts, starting with your shoulders and hips, to add precision to your moves.", R.drawable.day8),
            tip("Day 9: The Criss Cross", "Jump Around  ","Learn the criss cross, a bouncy move that adds playfulness and fun to your routine.", R.drawable.day9),
            tip("Day 10: The Moonwalk", "Glide Like MJ","Master the moonwalk, one of the most iconic moves in hip-hop dance.", R.drawable.day10),
            tip("Day 11: The Snake", "Flow Like a Snake","Learn the snake move to add a wavy, fluid dynamic to your style.", R.drawable.day11),
            tip("Day 12: Popping Basics", "Pop with Precision","Start learning popping by focusing on quick, sharp contractions of muscles to create a popping effect.", R.drawable.day12),
            tip("Day 13: The C-Walk", "Crip Walk Mastery","Get into intricate footwork by mastering the C-Walk, a staple in hip-hop culture.", R.drawable.day13),
            tip("Day 14: The Slide Step", "Glide Across the Floor","Learn how to smoothly glide and slide across the floor in this classic hip-hop move.", R.drawable.day14),
            tip("Day 15: Locking", "Lock it In","Master wrist rolls and get a taste of locking, a foundational street dance style within hip-hop.", R.drawable.day15),
            tip("Day 16: Footwork Fundamentals", "Fast Feet","Focus on quick, precise footwork to build speed and agility.", R.drawable.day16),
            tip("Day 17: The Wave", "Flow Like Water","Learn the wave, an essential move that adds smoothness and fluidity to your dance.", R.drawable.day17),
            tip("Day 18: Toprock", "Start with the Toprock","Master the toprock, the first part of breaking (breakdancing), focusing on rhythm and flow.", R.drawable.day18),
            tip("Day 19: The Harlem Shake", "Shake it Up","Learn the Harlem Shake, a playful, energetic move that lets your body get loose.", R.drawable.day19),
            tip("Day 20: Arm Waves", "Wave it Out","Add style to your popping by mastering arm waves, making it look like a ripple traveling through your arms.", R.drawable.day20),
            tip("Day 21: The Kick Step", "Step with Power","Learn the kick step, an energetic footwork move that adds a sharp dynamic to your style.", R.drawable.day21),
            tip("Day 22: Breakdance", "Hit the Floor","Get down to the floor and master the 6-step, a fundamental breakdance move.", R.drawable.day22),
            tip("Day 23: The Dougie Variation", "Dougie with a Twist"," Add your own twist and style to the Dougie, making the move unique to you.", R.drawable.day23),
            tip("Day 24: The Cat Daddy", "Smooth Operator","Learn the Cat Daddy, a smooth hip-hop move that lets you groove with laid-back style.", R.drawable.day24),
            tip("Day 25: Speed Control", "Fast vs. Slow","Practice controlling your speed, alternating between fast and slow movements to add contrast to your dance.", R.drawable.day25),
            tip("Day 26: The SpongeBob", "Bounce Like a Sponge","Master the SpongeBob, a fun and bouncy footwork-based hip-hop move.", R.drawable.day26),
            tip("Day 27: The Stanky Leg", "Get Stanky","Get playful with the Stanky Leg, a fun, laid-back move that lets you vibe to the music.", R.drawable.day27),
            tip("Day 28: Freestyle Groove", "Find Your Flow","Spend time freestyling, letting your creativity guide your moves without set choreography.", R.drawable.day28),
            tip("Day 29: The Jerkin' Basics", "Jerk it Out"," Learn the basics of Jerkin’, a hip-hop dance style with quick footwork and bounces.", R.drawable.day29),
            tip("Day 30: Choreography Showcase", "Bring it All Together","Create your own hip-hop routine by combining your favorite moves from the past 30 days. Show off your unique style!", R.drawable.day30),
            )

        recyclerView.adapter = TipsAdapter(tip_of_the_day)
    }
}