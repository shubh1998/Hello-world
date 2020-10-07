// Short-circuiting vs traditional if
const a = null;
const b = 500;

// If a is false then it won't print nothing
if (a && b) {
  console.log(b);
}

// b is true, so it will show our message
if (a || b) {
  console.log(b);
}

/* 
Resume:
(some falsy expression) && expr will evaluate to falsy expression
(some truthy expression) || expr will evaluate to truthy expression
*/
