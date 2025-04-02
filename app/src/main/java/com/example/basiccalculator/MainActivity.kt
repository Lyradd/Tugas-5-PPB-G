package com.example.basiccalculator

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.basiccalculator.ui.theme.BasicCalculatorTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            BasicCalculatorTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    SimpleCalculator()
                }
            }
        }
    }
}

@Composable
fun SimpleCalculator() {
    val purpleColor = Color(0xFF673AB7)
    val lightPurpleColor = Color(0xFFEDE7F6)

    var valueA by remember { mutableStateOf("0") }
    var valueB by remember { mutableStateOf("0") }
    var result by remember { mutableStateOf("0") }
    var activeValue by remember { mutableStateOf("A") }
    var currentOperation by remember { mutableStateOf("") }
    var isNewOperation by remember { mutableStateOf(true) }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
            .padding(16.dp),
        verticalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        Text(
            text = "Result",
            fontSize = 16.sp,
            modifier = Modifier
                .fillMaxWidth()
                .padding(bottom = 4.dp),
            color = Color.Black
        )
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(50.dp)
                .clip(RoundedCornerShape(4.dp))
                .background(lightPurpleColor)
                .padding(horizontal = 8.dp),
            contentAlignment = Alignment.CenterEnd
        ) {
            Text(
                text = result,
                fontSize = 20.sp,
                textAlign = TextAlign.End,
                modifier = Modifier.fillMaxWidth(),
                fontWeight = FontWeight.Bold
            )
        }

        Spacer(modifier = Modifier.height(8.dp))
        
        Text(
            text = "Value A",
            fontSize = 16.sp,
            modifier = Modifier
                .fillMaxWidth()
                .padding(bottom = 4.dp),
            color = Color.Black
        )
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(50.dp)
                .clip(RoundedCornerShape(4.dp))
                .background(lightPurpleColor)
                .padding(horizontal = 8.dp),
            contentAlignment = Alignment.CenterEnd
        ) {
            Text(
                text = valueA,
                fontSize = 20.sp,
                textAlign = TextAlign.End,
                modifier = Modifier.fillMaxWidth()
            )
        }
        
        Text(
            text = "Value B",
            fontSize = 16.sp,
            modifier = Modifier
                .fillMaxWidth()
                .padding(bottom = 4.dp),
            color = Color.Black
        )
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(50.dp)
                .clip(RoundedCornerShape(4.dp))
                .background(lightPurpleColor)
                .padding(horizontal = 8.dp),
            contentAlignment = Alignment.CenterEnd
        ) {
            Text(
                text = valueB,
                fontSize = 20.sp,
                textAlign = TextAlign.End,
                modifier = Modifier.fillMaxWidth()
            )
        }

        Spacer(modifier = Modifier.height(16.dp))

        Column(
            verticalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(8.dp)
            ) {
                for (num in 1..3) {
                    Button(
                        onClick = {
                            if (activeValue == "A") {
                                if (valueA == "0" || isNewOperation) {
                                    valueA = num.toString()
                                    isNewOperation = false
                                } else {
                                    valueA += num.toString()
                                }
                            } else {
                                if (valueB == "0" || isNewOperation) {
                                    valueB = num.toString()
                                    isNewOperation = false
                                } else {
                                    valueB += num.toString()
                                }
                            }
                        },
                        colors = ButtonDefaults.buttonColors(
                            containerColor = Color.LightGray,
                            contentColor = Color.Black
                        ),
                        modifier = Modifier.weight(1f)
                    ) {
                        Text(text = num.toString(), fontSize = 20.sp)
                    }
                }
            }

            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(8.dp)
            ) {
                for (num in 4..6) {
                    Button(
                        onClick = {
                            if (activeValue == "A") {
                                if (valueA == "0" || isNewOperation) {
                                    valueA = num.toString()
                                    isNewOperation = false
                                } else {
                                    valueA += num.toString()
                                }
                            } else {
                                if (valueB == "0" || isNewOperation) {
                                    valueB = num.toString()
                                    isNewOperation = false
                                } else {
                                    valueB += num.toString()
                                }
                            }
                        },
                        colors = ButtonDefaults.buttonColors(
                            containerColor = Color.LightGray,
                            contentColor = Color.Black
                        ),
                        modifier = Modifier.weight(1f)
                    ) {
                        Text(text = num.toString(), fontSize = 20.sp)
                    }
                }
            }

            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(8.dp)
            ) {
                for (num in 7..9) {
                    Button(
                        onClick = {
                            if (activeValue == "A") {
                                if (valueA == "0" || isNewOperation) {
                                    valueA = num.toString()
                                    isNewOperation = false
                                } else {
                                    valueA += num.toString()
                                }
                            } else {
                                if (valueB == "0" || isNewOperation) {
                                    valueB = num.toString()
                                    isNewOperation = false
                                } else {
                                    valueB += num.toString()
                                }
                            }
                        },
                        colors = ButtonDefaults.buttonColors(
                            containerColor = Color.LightGray,
                            contentColor = Color.Black
                        ),
                        modifier = Modifier.weight(1f)
                    ) {
                        Text(text = num.toString(), fontSize = 20.sp)
                    }
                }
            }

            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(8.dp)
            ) {
                Spacer(modifier = Modifier.weight(1f))
                Button(
                    onClick = {
                        if (activeValue == "A") {
                            if (valueA == "0" || isNewOperation) {
                                valueA = "0"
                                isNewOperation = false
                            } else {
                                valueA += "0"
                            }
                        } else {
                            if (valueB == "0" || isNewOperation) {
                                valueB = "0"
                                isNewOperation = false
                            } else {
                                valueB += "0"
                            }
                        }
                    },
                    colors = ButtonDefaults.buttonColors(
                        containerColor = Color.LightGray,
                        contentColor = Color.Black
                    ),
                    modifier = Modifier.weight(1f)
                ) {
                    Text(text = "0", fontSize = 20.sp)
                }
                Spacer(modifier = Modifier.weight(1f))
            }

            Spacer(modifier = Modifier.height(8.dp))

            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(8.dp)
            ) {
                Button(
                    onClick = {
                        currentOperation = "+"
                        activeValue = "B"
                        isNewOperation = true
                    },
                    colors = ButtonDefaults.buttonColors(
                        containerColor = purpleColor,
                        contentColor = Color.White
                    ),
                    modifier = Modifier.weight(1f)
                ) {
                    Text(text = "Add", fontSize = 16.sp)
                }
                Button(
                    onClick = {
                        currentOperation = "-"
                        activeValue = "B"
                        isNewOperation = true
                    },
                    colors = ButtonDefaults.buttonColors(
                        containerColor = purpleColor,
                        contentColor = Color.White
                    ),
                    modifier = Modifier.weight(1f)
                ) {
                    Text(text = "Sub", fontSize = 16.sp)
                }
                Button(
                    onClick = {
                        currentOperation = "*"
                        activeValue = "B"
                        isNewOperation = true
                    },
                    colors = ButtonDefaults.buttonColors(
                        containerColor = purpleColor,
                        contentColor = Color.White
                    ),
                    modifier = Modifier.weight(1f)
                ) {
                    Text(text = "Mul", fontSize = 16.sp)
                }
                Button(
                    onClick = {
                        currentOperation = "/"
                        activeValue = "B"
                        isNewOperation = true
                    },
                    colors = ButtonDefaults.buttonColors(
                        containerColor = purpleColor,
                        contentColor = Color.White
                    ),
                    modifier = Modifier.weight(1f)
                ) {
                    Text(text = "Div", fontSize = 16.sp)
                }
            }

            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(8.dp)
            ) {
                Button(
                    onClick = {
                        valueA = "0"
                        valueB = "0"
                        result = "0"
                        currentOperation = ""
                        isNewOperation = true
                        activeValue = "A"
                    },
                    colors = ButtonDefaults.buttonColors(
                        containerColor = Color.Red,
                        contentColor = Color.White
                    ),
                    modifier = Modifier.weight(1f)
                ) {
                    Text(text = "Clear", fontSize = 18.sp)
                }
                Button(
                    onClick = {
                        if (valueA != "0" || valueB != "0" || currentOperation.isNotEmpty()) {
                            val numA = valueA.toDouble()
                            val numB = valueB.toDouble()
                            val calcResult = when (currentOperation) {
                                "+" -> numA + numB
                                "-" -> numA - numB
                                "*" -> numA * numB
                                "/" -> if (numB != 0.0) numA / numB else Double.NaN
                                else -> 0.0
                            }
                            result = when {
                                calcResult.isNaN() -> "Error"
                                calcResult == calcResult.toLong().toDouble() -> calcResult.toLong().toString()
                                else -> calcResult.toString()
                            }
                            valueA = result
                            valueB = "0"
                            isNewOperation = true
                            activeValue = "A"
                        }
                    },
                    colors = ButtonDefaults.buttonColors(
                        containerColor = Color.Green,
                        contentColor = Color.White
                    ),
                    modifier = Modifier.weight(1f)
                ) {
                    Text(text = "Enter", fontSize = 18.sp)
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun SimpleCalculatorPreview() {
    BasicCalculatorTheme {
        SimpleCalculator()
    }
}