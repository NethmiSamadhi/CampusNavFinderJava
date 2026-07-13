# Your Part: Accessibility-First Routing + Console UI

## What you own
- src/algorithms/AccessibilityFilter.java
- src/ui/ConsoleUI.java
- src/core/RouteFormatter.java
- src/Main.java
- test/tests/TestAccessibilityFilter.java
- test/tests/AllTests.java (runs every module's tests together)

## What this does
Filters out stairs-only paths so wheelchair/mobility-impaired users get a
guaranteed accessible route, with clear feedback if no accessible route
exists. Also owns the console interface that ties the whole app together
for the user, and the entry point (Main.java).

## How to add this to the shared repo
1. Clone the shared repo: git clone https://github.com/NethmiSamadhi/CampusNavFinderJava.git
2. Copy these files into matching folders in the cloned repo.
3. Set your own git identity:
   git config user.name "Your Name"
   git config user.email "your-email@gmail.com"
4. Commit and push:
   git add src/algorithms/AccessibilityFilter.java src/ui src/core/RouteFormatter.java src/Main.java test/tests/TestAccessibilityFilter.java test/tests/AllTests.java
   git commit -m "Add accessibility routing feature and console UI"
   git push

## Viva talking points
- Explain how this reuses Dijkstra's existing avoidStairs flag rather than
  writing a new algorithm from scratch (keeps things simple, less error-prone).
- Be ready to demo the console app live and explain the menu flow.
