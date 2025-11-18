const values = ["50", "hello", false, null, "100px"];

values.forEach(val => {
    console.log(`  Number(): ${Number(val)}`);
    console.log(`  Boolean(): ${Boolean(val)}`);
    console.log(`  String(): ${String(val)}`);
    console.log('---');
});